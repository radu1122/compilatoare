package cool.compiler;

public interface ASTVisitor<T> {
    T visit(ClassElem classElem);
    T visit(FuncDef funcDefElem);
    T visit(VarDef varDefElem);
    T visit(Formal formalElem);
    T visit(Assignment assignmentElem);
    T visit(ClassDispatch classDispatchElem);
    T visit(Dispatch dispatchElem);
    T visit(IfElem ifClauseElem);
    T visit(WhileELem whileClauseElem);
    T visit(NestedExpr nestedExprElem);
    T visit(LetDefinition letDefinitionElem);
    T visit(LetElem letClauseElem);
    T visit(CaseElem caseClauseElem);
    T visit(Instantiation instantiationElem);
    T visit(IsVoidElem isVoidClauseElem);
    T visit(Add addElem);
    T visit(Sub subElem);
    T visit(Mul mulElem);
    T visit(Div divElem);
    T visit(Negation negationElem);
    T visit(LessThan lessThanElem);
    T visit(LessEq lessEqElem);
    T visit(Equals equalsElem);
    T visit(NegationElem logicalNegationElem);
    T visit(Paren parenElem);
    T visit(Id idElem);
    T visit(Int intElem);
    T visit(Str strElem);
    T visit(Bool boolElem);
    T visit(Program programElem);
}
