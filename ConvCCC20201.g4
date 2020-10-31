grammar ConvCCC20201;

program: statement | funclist |;

funclist: funcdef funclist1;

funclist1: funclist |;

funcdef:
	DEF IDENT OPENPAR paramlist CLOSEPAR OPENBRACE statelist CLOSEBRACE;

paramlist: vartype IDENT paramlist1 |;

paramlist1: COMMA paramlist |;

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

atribstat: lvalue EQUAL atribstat1;

atribstat1: expression | allocexpression;

paramlistcall: IDENT paramlistcall1 |;

paramlistcall1: COMMA paramlistcall |;

printstat: PRINT expression;

readstat: READ lvalue;

returnstat: RETURN;

ifstat: IF OPENPAR expression CLOSEPAR OPENBRACE statelist CLOSEBRACE elsestat;

elsestat: ELSE statement |;

forstat:
	FOR OPENPAR atribstat SEMICOLON expression SEMICOLON atribstat CLOSEPAR statement;

statelist: statement statelist1;

statelist1: statelist |;

allocexpression:
	NEW vartype OPENBRACKET numexpression CLOSEBRACKET numexpbracket;

numexpbracket: OPENBRACKET numexpression CLOSEBRACKET |;

expression: numexpression expression1;

expression1: comparator numexpression |;

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

term1: priorarith unaryexpr term1 |;

minorarith: PLUS | MINUS;

priorarith: MULTIPLY | DIVIDE | MODULE;

unaryexpr: minorarith factor | factor;

factor:
	INT_CONSTANT
	| FLOAT_CONSTANT
	| STRING_CONSTANT
	| NULL
	| IDENT factor1
	| OPENPAR numexpression CLOSEPAR;

factor1:
	numexpbracket | OPENPAR paramlistcall CLOSEPAR;

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