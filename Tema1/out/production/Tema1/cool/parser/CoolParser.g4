parser grammar CoolParser;

options {
    tokenVocab = CoolLexer;
}

@header{
    package cool.parser;
}

program
    : ((modules+=classELem) SEMI)+  EOF
    ;

classELem:
    CLASS type=TYPE (INHERITS inheritance=TYPE)? LBRACE (features+=feature SEMI)* RBRACE;

feature: fname=ID LPAREN ((args+=formal COMMA)* args+=formal)? RPAREN COLON type=TYPE LBRACE body=expr RBRACE   # funcDef
    | id=ID COLON type=TYPE (ASSIGN init=expr)?                                                                 # varDef
    ;

formal: name=ID COLON type=TYPE;

letDefinition: name=ID COLON type=TYPE (ASSIGN initializator=expr)?;

expr
    : target=expr (AT supertype=TYPE)? DOT method=ID LPAREN ((args+=expr COMMA)* args+=expr)? RPAREN            # classDispatch
    | fname=ID LPAREN ((fargs+=expr COMMA)* fargs+=expr)? RPAREN                                                # dispatch
    | NEG op=expr                                                                                               # negation
    | lop=expr MULT rop=expr                                                                                    # mul
    | lop=expr DIV rop=expr                                                                                     # div
    | lop=expr PLUS rop=expr                                                                                    # add
    | lop=expr MINUS rop=expr                                                                                   # sub
    | lop=expr LE rop=expr                                                                                      # lessEq
    | lop=expr LT rop=expr                                                                                      # lessThan
    | lop=expr EQUAL rop=expr                                                                                   # equals
    | IF cond=expr THEN thenBranch=expr ELSE elseBranch=expr FI                                                 # ifElem
    | WHILE cond=expr LOOP body=expr POOL                                                                       # whileElem
    | LBRACE (expressions+=expr SEMI)+ RBRACE                                                                   # nestedExpr
    | LET definitions+=letDefinition (COMMA definitions+=letDefinition)* IN body=expr                           # letElem
    | CASE target=expr OF (types+=formal RARROW branches+=expr SEMI)+ ESAC                                      # caseElem
    | NEW type=TYPE                                                                                             # instantiation
    | ISVOID op=expr                                                                                            # isVoidElem
    | NOT op=expr                                                                                               # negationElem
    | LPAREN body=expr RPAREN                                                                                   # parenthesis
    | ID                                                                                                        # id
    | INT                                                                                                       # int
    | STRING                                                                                                    # str
    | BOOL                                                                                                      # boolVal
    | recipient=ID ASSIGN val=expr                                                                              # assignment
    ;