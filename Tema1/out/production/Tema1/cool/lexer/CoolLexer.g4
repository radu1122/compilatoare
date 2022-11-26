lexer grammar CoolLexer;

tokens { ERROR } 

@header{
    package cool.lexer;
}

@members{
    private void raiseError(String msg) {
        setText(msg);
        setType(ERROR);
    }
}


NEW: ('n'|'N')('e'|'E')('w'|'W');
CLASS: ('c'|'C')('l'|'L')('a'|'A')('s'|'S')('s'|'S');
INHERITS: ('i'|'I')('n'|'N')('h'|'H')('e'|'E')('r'|'R')('i'|'I')('t'|'T')('s'|'S');

LET: ('l'|'L')('e'|'E')('t'|'T');
IN: ('i'|'I')('n'|'N');

NOT: ('n'|'N')('o'|'O')('t'|'T');
AT: '@';

IF: ('i'|'I')('f'|'F');
FI: ('f'|'F')('i'|'I');

THEN: ('t'|'T')('h'|'H')('e'|'E')('n'|'N');
ELSE: ('e'|'E')('l'|'L')('s'|'S')('e'|'E');

WHILE: ('w'|'W')('h'|'H')('i'|'I')('l'|'L')('e'|'E');
LOOP: ('l'|'L')('o'|'O')('o'|'O')('p'|'P');
POOL: ('p'|'P')('o'|'O')('o'|'O')('l'|'L');

CASE: ('c'|'C')('a'|'A')('s'|'S')('e'|'E');
OF: ('o'|'O')('f'|'F');
ESAC: ('e'|'E')('s'|'S')('a'|'A')('c'|'C');

RARROW: '=>';
ISVOID: ('i'|'I')('s'|'S')('v'|'V')('o'|'O')('i'|'I')('d'|'D');

BOOL: (('t'|'T')('r'|'R')('u'|'U')('e'|'E')) | (('f'|'F')('a'|'A')('l'|'L')('s'|'S')('e'|'E'));

fragment LOWERCASE: [a-z];
fragment UPPERCASE: [A-Z];
fragment NAME: (LOWERCASE | UPPERCASE | '_' | DIGIT)*;

TYPE: UPPERCASE NAME;

ID: LOWERCASE NAME;

fragment DIGIT: [0-9];
INT: DIGIT+;

fragment NEW_LINE : '\r'? '\n';

STRING: '"' ('\\"' | '\\' NEW_LINE | .)*? (
	'"' {
		String str = getText();
		if (str.length() > 1024) {
			raiseError("String constant too long");
		} else if (str.contains("\0")) {
			raiseError("String contains null character");
		} else {
			setText(str.substring(1, str.length() - 1)
			.replaceAll("\\\r\n", "\r\n")
			.replaceAll("\\\n", "\n")
			.replace("\\n", "\n")
			.replaceAll("\\t", "\t")
			.replaceAll("\\\\(?!\\\\)", ""));
		}
	}
	| EOF { raiseError("EOF in string constant"); }
	| NEW_LINE { raiseError("Unterminated string constant"); }
);

SEMI: ';';
COLON: ':';
COMMA: ',';

EQUAL: '=';
LT: '<';
LE: '<=';
NEG: '~';
ASSIGN: '<-';
DOT: '.';

LPAREN: '(';
RPAREN: ')';
LBRACE: '{';
RBRACE: '}';
PLUS: '+';
MINUS: '-';
MULT: '*';
DIV: '/';

LINE_COMMENT: '--' ~[\r\n]* -> skip;

BLOCK_COMMENT: '(*' (BLOCK_COMMENT | .)*? (
	'*)' { skip(); }
	| EOF { raiseError("EOF in comment"); }
);

INCORRECT_COMMENT: '*)' { raiseError("Unmatched *)"); };


WS
    :   [ \n\f\r\t]+ -> skip
    ;

INVALID: . { raiseError("Invalid character: " + getText()); };
