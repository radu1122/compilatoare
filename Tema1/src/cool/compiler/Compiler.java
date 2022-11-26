package cool.compiler;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import cool.lexer.*;
import cool.parser.*;

import java.io.*;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;


public class Compiler {
    // Annotates class nodes with the names of files where they are defined.
    public static ParseTreeProperty<String> fileNames = new ParseTreeProperty<>();

    public static void main(String[] args) throws IOException {
        if (args.length == 0) {
            System.err.println("No file(s) given");
            return;
        }

        CoolLexer lexer = null;
        CommonTokenStream tokenStream = null;
        CoolParser parser = null;
        ParserRuleContext globalTree = null;

        // True if any lexical or syntax errors occur.
        boolean lexicalSyntaxErrors = false;

        // Parse each input file and build one big parse tree out of
        // individual parse trees.
        for (var fileName : args) {
            var input = CharStreams.fromFileName(fileName);

            // Lexer
            if (lexer == null)
                lexer = new CoolLexer(input);
            else
                lexer.setInputStream(input);

            // Token stream
            if (tokenStream == null)
                tokenStream = new CommonTokenStream(lexer);
            else
                tokenStream.setTokenSource(lexer);


//            // Test lexer only.
//            tokenStream.fill();
//            List<Token> tokens = tokenStream.getTokens();
//            tokens.stream().forEach(token -> {
//                var text = token.getText();
//                var name = CoolLexer.VOCABULARY.getSymbolicName(token.getType());
//
//                System.out.println(text + " : " + name);
//                //System.out.println(token);
//            });


            // Parser
            if (parser == null)
                parser = new CoolParser(tokenStream);
            else
                parser.setTokenStream(tokenStream);

            // Customized error listener, for including file names in error
            // messages.
            var errorListener = new BaseErrorListener() {
                public boolean errors = false;

                @Override
                public void syntaxError(Recognizer<?, ?> recognizer,
                                        Object offendingSymbol,
                                        int line, int charPositionInLine,
                                        String msg,
                                        RecognitionException e) {
                    String newMsg = "\"" + new File(fileName).getName() + "\", line " +
                                        line + ":" + (charPositionInLine + 1) + ", ";

                    Token token = (Token)offendingSymbol;
                    if (token.getType() == CoolLexer.ERROR)
                        newMsg += "Lexical error: " + token.getText();
                    else
                        newMsg += "Syntax error: " + msg;

                    System.err.println(newMsg);
                    errors = true;
                }
            };

            parser.removeErrorListeners();
            parser.addErrorListener(errorListener);

            // Actual parsing
            var tree = parser.program();
            if (globalTree == null)
                globalTree = tree;
            else
                // Add the current parse tree's children to the global tree.
                for (int i = 0; i < tree.getChildCount(); i++)
                    globalTree.addAnyChild(tree.getChild(i));

            // Annotate class nodes with file names, to be used later
            // in semantic error messages.
            for (int i = 0; i < tree.getChildCount(); i++) {
                var child = tree.getChild(i);
                // The only ParserRuleContext children of the program node
                // are class nodes.
                if (child instanceof ParserRuleContext)
                    fileNames.put(child, fileName);
            }

            // Record any lexical or syntax errors.
            lexicalSyntaxErrors |= errorListener.errors;
        }

        // Stop before semantic analysis phase, in case errors occurred.
        if (lexicalSyntaxErrors) {
            System.err.println("Compilation halted");
            return;
        }

        // TODO Print tree
        var constructVisitor = new CoolParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitClassELem(CoolParser.ClassELemContext ctx) {
                return new ClassElem(ctx.type, ctx.inheritance, ctx.features.stream().map(fc -> (Feature)visit(fc)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitFuncDef(CoolParser.FuncDefContext ctx) {
                return new FuncDef(ctx.fname, ctx.args.stream().map(formalArg -> (Formal)visitFormal(formalArg)).collect((Collectors.toList())), ctx.type, (Expr)visit(ctx.body));
            }

            @Override
            public ASTNode visitVarDef(CoolParser.VarDefContext ctx) {
                return new VarDef(ctx.id, ctx.type, Objects.nonNull(ctx.init) ? (Expr)visit(ctx.init) : null);
            }

            @Override
            public ASTNode visitFormal(CoolParser.FormalContext ctx) {
                return new Formal(ctx.name, ctx.type);
            }

            @Override
            public ASTNode visitAssignment(CoolParser.AssignmentContext ctx) {
                return new Assignment(ctx.start, ctx.recipient, (Expr)visit(ctx.val));
            }

            @Override
            public ASTNode visitClassDispatch(CoolParser.ClassDispatchContext ctx) {
                return new ClassDispatch(ctx.start, (Expr)visit(ctx.target), ctx.supertype, ctx.method, ctx.args.stream().map(ex -> (Expr)visit(ex)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitDispatch(CoolParser.DispatchContext ctx) {
                return new Dispatch(ctx.start, ctx.fname, ctx.fargs.stream().map(ex -> (Expr)visit(ex)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitIfElem(CoolParser.IfElemContext ctx) {
                return new IfElem((Expr)visit(ctx.cond), (Expr)visit(ctx.thenBranch), (Expr)visit(ctx.elseBranch), ctx.start);
            }

            @Override
            public ASTNode visitWhileElem(CoolParser.WhileElemContext ctx) {
                return new WhileELem(ctx.start, (Expr)visit(ctx.cond), (Expr)visit(ctx.body));
            }

            @Override
            public ASTNode visitNestedExpr(CoolParser.NestedExprContext ctx) {
                return new NestedExpr(ctx.start, ctx.expressions.stream().map(ex -> (Expr)visit(ex)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitLetDefinition(CoolParser.LetDefinitionContext ctx) {
                return new LetDefinition(ctx.name, ctx.type, Objects.isNull(ctx.initializator) ? null : (Expr)visit(ctx.initializator));
            }

            @Override
            public ASTNode visitLetElem(CoolParser.LetElemContext ctx) {
                return new LetElem(ctx.start, ctx.definitions.stream().map(fml -> (LetDefinition)visitLetDefinition(fml)).collect(Collectors.toList()), (Expr)visit(ctx.body));
            }

            @Override
            public ASTNode visitCaseElem(CoolParser.CaseElemContext ctx) {
                return new CaseElem(ctx.start, (Expr)visit(ctx.target),
                        ctx.types.stream().map(fml -> (Formal)visitFormal(fml)).collect(Collectors.toList()),
                        ctx.branches.stream().map(ex -> (Expr)visit(ex)).collect(Collectors.toList()));
            }

            @Override
            public ASTNode visitInstantiation(CoolParser.InstantiationContext ctx) {
                return new Instantiation(ctx.start, ctx.type);
            }

            @Override
            public ASTNode visitIsVoidElem(CoolParser.IsVoidElemContext ctx) {
                return new IsVoidElem(ctx.start, (Expr)visit(ctx.op));
            }

            @Override
            public ASTNode visitAdd(CoolParser.AddContext ctx) {
                return new Add(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitSub(CoolParser.SubContext ctx) {
                return new Sub(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitMul(CoolParser.MulContext ctx) {
                return new Mul(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitDiv(CoolParser.DivContext ctx) {
                return new Div(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitNegation(CoolParser.NegationContext ctx) {
                return new Negation(ctx.start, (Expr)visit(ctx.op));
            }

            @Override
            public ASTNode visitLessThan(CoolParser.LessThanContext ctx) {
                return new LessThan(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitLessEq(CoolParser.LessEqContext ctx) {
                return new LessEq(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitEquals(CoolParser.EqualsContext ctx) {
                return new Equals(ctx.start, (Expr)visit(ctx.rop), (Expr)visit(ctx.lop));
            }

            @Override
            public ASTNode visitNegationElem(CoolParser.NegationElemContext ctx) {
                return new NegationElem(ctx.start, (Expr)visit(ctx.op));
            }

            @Override
            public ASTNode visitParenthesis(CoolParser.ParenthesisContext ctx) {
                return new Paren(ctx.start, (Expr)visit(ctx.body));
            }

            @Override
            public ASTNode visitId(CoolParser.IdContext ctx) {
                return new Id(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitInt(CoolParser.IntContext ctx) {
                return new Int(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitStr(CoolParser.StrContext ctx) {

                return new Str(ctx.STRING().getSymbol());
            }

            @Override
            public ASTNode visitBoolVal(CoolParser.BoolValContext ctx) {

                return new Bool(ctx.BOOL().getSymbol());
            }

            @Override
            public ASTNode visitProgram(CoolParser.ProgramContext ctx) {
                return new Program(ctx.modules.stream().map(cl -> (ClassElem)visitClassELem(cl)).collect(Collectors.toList()));
            }
        };

        // build the auxiliary representation
        var ast = constructVisitor.visit(globalTree);

        ast.accept((new PrintVisitor()).getPrintVisitor());
    }
}
