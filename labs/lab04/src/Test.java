import java.io.IOException;
import java.util.*;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.ParseTreeWalker;


public class Test {

    public static void main(String[] args) throws IOException {
        var input = CharStreams.fromFileName("manual.txt");

        var lexer = new CPLangLexer(input);
        var tokenStream = new CommonTokenStream(lexer);

        /*
        tokenStream.fill();
        List<Token> tokens = tokenStream.getTokens();
        for (var token : tokens) {
            var text = token.getText();
            var type = CPLangLexer.VOCABULARY.getSymbolicName(token.getType());

            System.out.println(text + " : " + type);
        }
        */

        var parser = new CPLangParser(tokenStream);
        var tree = parser.prog();
        System.out.println(tree.toStringTree(parser));

        // Visitor-ul de mai jos parcurge arborele de derivare și construiește
        // un arbore de sintaxă abstractă (AST).
        var astConstructionVisitor = new CPLangParserBaseVisitor<ASTNode>() {
            @Override
            public ASTNode visitProg(CPLangParser.ProgContext ctx) {
                var listArray = new ArrayList<Instruction>();
                for (int i = 0; i < ctx.children.size() ;i++) {
                    listArray.add((Instruction) visit(ctx.children.get(i)));
                }
                return new Program(listArray);
            }

            @Override
            public ASTNode visitVarDef(CPLangParser.VarDefContext ctx) {
                return super.visitVarDef(ctx);
            }

            @Override
            public ASTNode visitFuncDef(CPLangParser.FuncDefContext ctx) {
                return super.visitFuncDef(ctx);
            }

            @Override
            public ASTNode visitFormal(CPLangParser.FormalContext ctx) {
                return super.visitFormal(ctx);
            }

            @Override
            public ASTNode visitCall(CPLangParser.CallContext ctx) {
                return super.visitCall(ctx);
            }

            @Override
            public ASTNode visitParen(CPLangParser.ParenContext ctx) {
                return super.visitParen(ctx);
            }

            @Override
            public ASTNode visitPlusMinus(CPLangParser.PlusMinusContext ctx) {
                return super.visitPlusMinus(ctx);
            }

            @Override
            public ASTNode visitBool(CPLangParser.BoolContext ctx) {
                return super.visitBool(ctx);
            }

            @Override
            public ASTNode visitMultDiv(CPLangParser.MultDivContext ctx) {
                return super.visitMultDiv(ctx);
            }

            @Override
            public ASTNode visitUnaryMinus(CPLangParser.UnaryMinusContext ctx) {
                return super.visitUnaryMinus(ctx);
            }

            @Override
            public ASTNode visitRelational(CPLangParser.RelationalContext ctx) {
                return super.visitRelational(ctx);
            }

            @Override
            public ASTNode visitId(CPLangParser.IdContext ctx) {
                return new Id(ctx.ID().getSymbol());
            }

            @Override
            public ASTNode visitFloat(CPLangParser.FloatContext ctx) {
                return super.visitFloat(ctx);
            }

            @Override
            public ASTNode visitInt(CPLangParser.IntContext ctx) {
                return new Int(ctx.INT().getSymbol());
            }

            @Override
            public ASTNode visitAssign(CPLangParser.AssignContext ctx) {
                return super.visitAssign(ctx);
            }

            @Override
            public ASTNode visitIf(CPLangParser.IfContext ctx) {
                return new If((Expression)visit(ctx.cond),
                        (Expression)visit(ctx.thenBranch),
                        (Expression)visit(ctx.elseBranch),
                        ctx.start);
            }



        };

        var ast = astConstructionVisitor.visit(tree);

        var printVisitor = new ASTVisitor<Void>() {
            int indent = 0;

            @Override
            public Void visit(Id id) {
                printIndent("ID " + id.token.getText());
                return null;
            }

            @Override
            public Void visit(Int intt) {
                printIndent("INT " + intt.token.getText());
                return null;
            }

            @Override
            public Void visit(If iff) {
                printIndent("IF");

                indent++;
                iff.cond.accept(this);
                iff.thenBranch.accept(this);
                iff.elseBranch.accept(this);
                indent--;

                return null;
            }

            @Override
            public Void visit(Call call) {
                printIndent("CALL");

                ++indent;
                printIndent(call.name.getText());
                call.args.forEach(arg -> arg.accept(this));
                --indent;

                return null;
            }

            @Override
            public Void visit(UnaryMinus unaryMinus) {
                printIndent(unaryMinus.token.getText());

                ++indent;
                unaryMinus.expr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Mult mult) {
                printIndent(mult.token.getText());

                ++indent;
                mult.leftExpr.accept(this);
                mult.rightExpr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Div div) {
                printIndent(div.token.getText());

                ++indent;
                div.leftExpr.accept(this);
                div.rightExpr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Plus plus) {
                printIndent(plus.token.getText());

                ++indent;
                plus.leftExpr.accept(this);
                plus.rightExpr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Minus minus) {
                printIndent(minus.token.getText());

                ++indent;
                minus.leftExpr.accept(this);
                minus.rightExpr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Relational relational) {
                printIndent(relational.token.getText());

                ++indent;
                relational.leftExpr.accept(this);
                relational.rightExpr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(Assign assign) {
                printIndent(assign.token.getText());

                ++indent;
                printIndent(assign.name.getText());
                assign.expr.accept(this);
                --indent;

                return null;
            }

            @Override
            public Void visit(FloatNode floatt) {
                printIndent(floatt.num.toString());
                return null;
            }

            @Override
            public Void visit(Bool booll) {
                printIndent(booll.val.toString());
                return null;
            }

            @Override
            public Void visit(Formal formal) {
                printIndent("FORMAL");

                ++indent;
                printIndent(formal.type.getText());
                printIndent(formal.name.getText());
                --indent;

                return null;
            }

            @Override
            public Void visit(VarDef varDef) {
                printIndent("VAR DEF");

                ++indent;
                printIndent(varDef.type.getText());
                printIndent(varDef.name.getText());

                if (varDef.value != null) {
                    ++indent;
                    varDef.value.accept(this);
                    --indent;
                }
                --indent;

                return null;
            }

            @Override
            public Void visit(FuncDef funcDef) {
                printIndent("FUNC DEF");

                ++indent;
                printIndent(funcDef.type.getText());
                printIndent(funcDef.name.getText());

                ++indent;
                funcDef.formals.forEach(formal -> formal.accept(this));

                ++indent;
                funcDef.body.accept(this);
                indent -= 3;

                return null;
            }

            @Override
            public Void visit(Program program) {
                printIndent("PROGRAM");

                ++indent;
                program.instructions.forEach(instr -> instr.accept(this));
                --indent;

                return null;
            }

            // TODO4: Afisati fiecare nod astfel incat nivelul pe care acesta
            // se afla in AST sa fie reprezentat de numarul de tab-uri.
            // Folositi functia de mai jos 'printIndent' si incrementati /
            // decrementati corespunzator numarul de tab-uri

            void printIndent(String str) {
                for (int i = 0; i < indent; i++)
                    System.out.print("\t");
                System.out.println(str);
            }
        };

        System.out.println("The AST is");
        ast.accept(printVisitor);
    }


}
