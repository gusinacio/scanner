grammar ConvCCC20201;

program: statement | funclist |;

funclist: funcdef funclist | funcdef;

funcdef:
	DEF IDENT OPENPAR paramlist CLOSEPAR OPENBRACE statelist CLOSEBRACE;

paramlist: (vartype IDENT (COMMA paramlist |)) |;

statement:
	vardecl SEMICOLON
	| atribstat SEMICOLON
	| printstat SEMICOLON
	| readstat SEMICOLON
	| returnstat SEMICOLON
	| ifstat
	| forstat
	| OPENBRACE statelist CLOSEBRACE
	| BREAK SEMICOLON
	| SEMICOLON;

vardecl: vartype IDENT bracket;

bracket: OPENBRACKET INT_CONSTANT CLOSEBRACKET bracket |;

vartype: INT | FLOAT | STRING;

atribstat:
	lvalue EQUAL (expression | allocexpression | funccall);

funccall: IDENT OPENPAR paramlistcall CLOSEPAR;

paramlistcall: (IDENT (COMMA paramlistcall |)) |;

printstat: PRINT expression;

readstat: READ lvalue;

returnstat: RETURN;

ifstat:
	IF OPENPAR expression CLOSEPAR statement (ELSE statement |);

forstat:
	FOR OPENPAR atribstat SEMICOLON expression SEMICOLON atribstat CLOSEPAR statement;

statelist: statement (statelist |);

allocexpression:
	NEW vartype OPENBRACKET numexpression CLOSEBRACKET numexpbracket;

numexpbracket: OPENBRACKET numexpression CLOSEBRACKET |;

expression: numexpression (comparator numexpression |);

comparator:
	LESS
	| GREATER
	| LESSEQUAL
	| GREATEREQUAL
	| EQUALCOMP
	| DIFFERENT;

numexpression: term numexpression1;

numexpression1: minorarith term |;

term: unaryexpr term1;

term1: priorarith unaryexpr |;

minorarith: PLUS | MINUS;

priorarith: MULTIPLY | DIVIDE | MODULE;

unaryexpr: minorarith factor | factor;

factor:
	INT_CONSTANT
	| FLOAT_CONSTANT
	| STRING_CONSTANT
	| NULL
	| lvalue
	| OPENPAR numexpression CLOSEPAR;

lvalue: IDENT numexpbracket;

LESS: '<';
GREATER: '>';
LESSEQUAL: '<=';
GREATEREQUAL: '>=';
EQUALCOMP: '==';
DIFFERENT: '!=';
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULE: '%';

EQUAL: '=';
SEMICOLON: ';';
COMMA: ',';
OPENPAR: '(';
CLOSEPAR: ')';
OPENBRACE: '{';
CLOSEBRACE: '}';
OPENBRACKET: '[';
CLOSEBRACKET: ']';

DEF: 'def';
NEW: 'new';
IF: 'if';
ELSE: 'else';
FOR: 'for';
RETURN: 'return';
BREAK: 'break';
PRINT: 'print';
READ: 'read';

INT: 'int';
FLOAT: 'float';
STRING: 'string';

NULL: 'null';
IDENT: [a-zA-Z_][a-zA-Z0-9_]*;
INT_CONSTANT: [0-9]+;
STRING_CONSTANT: '"' .*? '"';
FLOAT_CONSTANT: ('0' ..'9')+ '.' ('0' ..'9')+;

WS: [ \t\r\n]+ -> skip;
