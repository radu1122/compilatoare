package cool.compiler;

import org.antlr.v4.runtime.Token;
import java.util.*;
import java.util.stream.Collectors;


// this class will be the root of the AST
public abstract class ASTNode {
    public <T> T accept(ASTVisitor<T> visitor) {
        return null;
    }
}

class Formal extends ASTNode {
    Token type;
    Token token;

    Formal(Token token, Token type) {
        this.token = token;
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClassElem extends ASTNode {
    Token typename;
    Token inheritance;
    List<Feature> features;

    ClassElem(Token typename, Token inheritance, List<Feature> features) {
        this.typename = typename;
        this.inheritance = inheritance;
        this.features = features;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}


// this class will be used for function definitions
class FuncDef extends Feature {
    List<Formal> arguments;
    Expr body;

    FuncDef(Token token, Token id, List<Formal> arguments, Token type, Expr body) {
        super(token, id, type);
        this.arguments = arguments;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// this class will be used for variable definitions
class VarDef extends Feature {
    Expr assignment;

    VarDef(Token token, Token id, Token type, Expr assignment) {
        super(token, id, type);
        this.assignment = assignment;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// this class will be used for variable definitions
class Assignment extends Expr {
    Expr value;
    Token recipient;

    Assignment(Token token, Token recipient, Expr val) {
        super(token);
        this.recipient = recipient;
        this.value = val;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class ClassDispatch extends Expr {
    Expr target;
    Token supertype;
    Token method;
    List<Expr> arguments;

    ClassDispatch(Token token, Expr target, Token supertype, Token method, List<Expr> args) {
        super(token);
        this.target = target;
        this.supertype = supertype;
        this.method = method;
        this.arguments = args;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Dispatch extends Expr {
    Token fname;
    List<Expr> args;

    Dispatch(Token token, Token Fname, List<Expr> Fargs) {
        super(token);
        this.fname = Fname;
        this.args = Fargs;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class IfElem extends Expr {
    // Sunt necesare trei câmpuri pentru cele trei componente ale expresiei.
    Expr cond;
    Expr thenBranch;
    Expr elseBranch;

    IfElem(Expr cond,
              Expr thenBranch,
              Expr elseBranch,
              Token start) {
        super(start);
        this.cond = cond;
        this.thenBranch = thenBranch;
        this.elseBranch = elseBranch;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class WhileELem extends Expr {
    Expr cond;
    Expr body;

    WhileELem(Token token, Expr cond, Expr body) {
        super(token);
        this.cond = cond;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NestedExpr extends Expr {
    List<Expr> expressions;

    NestedExpr(Token token, List<Expr> expressions) {
        super(token);
        this.expressions = expressions;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LetDefinition extends ASTNode {
    Token name;
    Token type;
    Expr initialization;

    LetDefinition(Token name, Token type, Expr initialization) {
        this.name = name;
        this.type = type;
        this.initialization = initialization;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LetElem extends Expr {
    List<LetDefinition> definitions;
    Expr body;

    LetElem(Token token, List<LetDefinition> definitions, Expr body) {
        super(token);
        this.definitions = definitions;
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class CaseElem extends Expr {
    Expr target;
    List<Formal> types;
    List<Expr> branches;

    CaseElem(Token token, Expr target, List<Formal> types, List<Expr> branches) {
        super(token);
        this.target = target;
        this.types = types;
        this.branches = branches;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Instantiation extends Expr {
    Token type;

    Instantiation(Token token, Token type) {
        super(token);
        this.type = type;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class IsVoidElem extends Expr {
    Expr body;

    IsVoidElem(Token token, Expr body) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Paren extends Expr {
    Expr body;

    Paren(Token token, Expr body) {
        super(token);
        this.body = body;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// identification
class Id extends Expr {
    Id(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// integers
class Int extends Expr {
    Int(Token token) {
        super(token);
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// strings
class Str extends Expr {
    Str(Token token) { super(token); }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// booleans
class Bool extends Expr {
    Bool(Token token) { super(token); }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

// main program
class Program extends ASTNode {
    List<ClassElem> classes;

    Program(List<ClassElem> classes) {
        this.classes = classes;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}