package cool.compiler;

import java.util.Objects;

public class PrintVisitor {
    private final ASTVisitor<Void> printVisitor;
    public PrintVisitor() {
        this.printVisitor = new ASTVisitor<>() {
            int indent = 0;


            @Override
            public Void visit(IsVoidElem isVoidElem) {
                PrintVisitor.printIndentation("isvoid", indent);
                indent++;
                isVoidElem.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Add addElem) {
                PrintVisitor.printIndentation("+", indent);
                indent++;
                addElem.lop.accept(this);
                addElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Sub subElem) {
                PrintVisitor.printIndentation("-", indent);
                indent++;
                subElem.lop.accept(this);
                subElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Mul mulElem) {
                PrintVisitor.printIndentation("*", indent);
                indent++;
                mulElem.lop.accept(this);
                mulElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Div divElem) {
                PrintVisitor.printIndentation("/", indent);
                indent++;
                divElem.lop.accept(this);
                divElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Negation negationElem) {
                PrintVisitor.printIndentation("~", indent);
                indent++;
                negationElem.op.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(LessThan lessThanElem) {
                PrintVisitor.printIndentation("<", indent);
                indent++;
                lessThanElem.lop.accept(this);
                lessThanElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(LessEq lessEqElem) {
                PrintVisitor.printIndentation("<=", indent);
                indent++;
                lessEqElem.lop.accept(this);
                lessEqElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Equals equalsElem) {
                PrintVisitor.printIndentation("=", indent);
                indent++;
                equalsElem.lop.accept(this);
                equalsElem.rop.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(NegationElem negationElem) {
                PrintVisitor.printIndentation("not", indent);
                indent++;
                negationElem.op.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(Formal formalElem) {
                PrintVisitor.printIndentation("formal", indent);
                indent++;
                PrintVisitor.printIndentation(formalElem.token.getText(), indent);
                PrintVisitor.printIndentation(formalElem.type.getText(), indent);
                indent--;
                return null;
            }

            @Override
            public Void visit(ClassElem classELem) {
                PrintVisitor.printIndentation("class", indent);
                indent++;
                PrintVisitor.printIndentation(classELem.typename.getText(), indent);
                if (!Objects.isNull(classELem.inheritance)) {
                    PrintVisitor.printIndentation(classELem.inheritance.getText(), indent);
                }

                classELem.features.forEach(feature -> feature.accept(this));
                indent--;
                return null;
            }

            @Override
            public Void visit(FuncDef funcDef) {
                PrintVisitor.printIndentation("method", indent);
                indent++;
                PrintVisitor.printIndentation(funcDef.id.getText(), indent);
                funcDef.arguments.forEach(formal -> formal.accept(this));
                PrintVisitor.printIndentation(funcDef.type.getText(), indent);
                funcDef.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(VarDef varDefElem) {
                PrintVisitor.printIndentation("attribute", indent);
                indent++;
                PrintVisitor.printIndentation(varDefElem.id.getText(), indent);
                PrintVisitor.printIndentation(varDefElem.type.getText(), indent);
                if (Objects.nonNull(varDefElem.assignment)) {
                    varDefElem.assignment.accept(this);
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Assignment assignmentElem) {
                PrintVisitor.printIndentation("<-", indent);
                indent++;
                PrintVisitor.printIndentation(assignmentElem.recipient.getText(), indent);
                assignmentElem.value.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(ClassDispatch classDispatchELem) {
                PrintVisitor.printIndentation(".", indent);
                indent++;
                classDispatchELem.target.accept(this);
                if (Objects.nonNull(classDispatchELem.supertype)) {
                    PrintVisitor.printIndentation(classDispatchELem.supertype.getText(), indent);
                }
                PrintVisitor.printIndentation(classDispatchELem.method.getText(), indent);
                classDispatchELem.arguments.forEach(elem -> elem.accept(this));
                indent--;
                return null;
            }

            @Override
            public Void visit(Dispatch dispatchElem) {
                PrintVisitor.printIndentation("implicit dispatch", indent);
                indent++;
                PrintVisitor.printIndentation(dispatchElem.fname.getText(), indent);
                // iterate over arguments with streams
                dispatchElem.args.forEach(arg -> arg.accept(this));
                indent--;
                return null;
            }

            @Override
            public Void visit(IfElem IfELem) {
                PrintVisitor.printIndentation("if", indent);
                indent++;
                IfELem.cond.accept(this);
                IfELem.thenBranch.accept(this);
                IfELem.elseBranch.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(WhileELem whileELem) {
                PrintVisitor.printIndentation("while", indent);
                indent++;
                whileELem.cond.accept(this);
                whileELem.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(NestedExpr nestedExprElem) {
                PrintVisitor.printIndentation("block", indent);
                indent++;
                nestedExprElem.expressions.forEach(expr -> expr.accept(this));
                indent--;
                return null;
            }

            @Override
            public Void visit(LetDefinition letDefinitionElem) {
                indent++;
                PrintVisitor.printIndentation(letDefinitionElem.name.getText(), indent);
                PrintVisitor.printIndentation(letDefinitionElem.type.getText(), indent);
                if (Objects.nonNull(letDefinitionElem.initialization)) {
                    letDefinitionElem.initialization.accept(this);
                }
                indent--;

                return null;
            }

            @Override
            public Void visit(LetElem letElem) {
                PrintVisitor.printIndentation("let", indent);
                indent++;
                for (LetDefinition letDefinition : letElem.definitions) {
                    PrintVisitor.printIndentation("local", indent);

                    letDefinition.accept(this);
                }
                letElem.body.accept(this);
                indent--;
                return null;
            }

            @Override
            public Void visit(CaseElem caseElem) {
                PrintVisitor.printIndentation("case", indent);
                indent++;
                caseElem.target.accept(this);
                for (int i = 0; i < caseElem.branches.size(); ++i) {
                    PrintVisitor.printIndentation("case branch", indent);
                    indent++;
                    PrintVisitor.printIndentation(caseElem.types.get(i).token.getText(), indent);
                    PrintVisitor.printIndentation(caseElem.types.get(i).type.getText(), indent);
                    caseElem.branches.get(i).accept(this);
                    indent--;
                }
                indent--;
                return null;
            }

            @Override
            public Void visit(Instantiation instantiationElem) {
                PrintVisitor.printIndentation("new", indent);
                indent++;
                PrintVisitor.printIndentation(instantiationElem.type.getText(), indent);
                indent--;
                return null;
            }

            @Override
            public Void visit(Paren parenElem) {
                parenElem.body.accept(this);
                return null;
            }

            @Override
            public Void visit(Id idElem) {
                PrintVisitor.printIndentation(idElem.token.getText(), indent);
                return null;
            }

            @Override
            public Void visit(Int intElem) {
                PrintVisitor.printIndentation(intElem.token.getText(), indent);
                return null;
            }

            @Override
            public Void visit(Str strElem) {
                PrintVisitor.printIndentation(strElem.token.getText(), indent);
                return null;
            }

            @Override
            public Void visit(Bool boolElem) {
                PrintVisitor.printIndentation(boolElem.token.getText(), indent);
                return null;
            }

            @Override
            public Void visit(Program programElem) {
                PrintVisitor.printIndentation("program", indent);
                indent++;
                programElem.classes.forEach(c -> c.accept(this));
                indent--;
                return null;
            }
        };


    }

    static void printIndentation(String str, Integer indent) {
        System.out.println("  ".repeat(indent) + str);
    }

    public ASTVisitor<Void> getPrintVisitor() {
        return printVisitor;
    }
}
