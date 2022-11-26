package cool.compiler;

import org.antlr.v4.runtime.Token;

// this class will be the root for all expressions
abstract class Expr extends ASTNode {
    Token token;

    Expr(Token token) {
        this.token = token;
    }
}

abstract class Feature extends ASTNode {
    Token id;
    Token type;

    Feature(Token id, Token type) {
        this.id = id;
        this.type = type;
    }
}


// arithmetic expressions

class Add extends Expr {
    Expr rop;
    Expr lop;

    Add(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Sub extends Expr {
    Expr rop;
    Expr lop;

    Sub(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Mul extends Expr {
    Expr rop;
    Expr lop;

    Mul(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Div extends Expr {
    Expr rop;
    Expr lop;

    Div(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Negation extends Expr {
    Expr op;

    Negation(Token token, Expr op) {
        super(token);
        this.op = op;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessThan extends Expr {
    Expr rop;
    Expr lop;

    LessThan(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class LessEq extends Expr {
    Expr rop;
    Expr lop;

    LessEq(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class Equals extends Expr {
    Expr rop;
    Expr lop;

    Equals(Token token, Expr rop, Expr lop) {
        super(token);
        this.rop = rop;
        this.lop = lop;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}

class NegationElem extends Expr {
    Expr op;

    NegationElem(Token token, Expr op) {
        super(token);
        this.op = op;
    }

    public <T> T accept(ASTVisitor<T> visitor) {
        return visitor.visit(this);
    }
}