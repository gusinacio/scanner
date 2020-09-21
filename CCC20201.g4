grammar CCC20201;

program         : statement
                | funclist
                | ;

funclist        : funcdef funclist
                | funcdef;

funcdef         : DEF IDENT OPENPAR paramlist CLOSEPAR OPENBRACE statelist CLOSEBRACE;

paramlist       : vartype IDENT COMMA paramlist
                | vartype IDENT
                | ;

statement       : vardecl SEMICOLON
                | atribstat SEMICOLON
                | printstat SEMICOLON
                | readstat SEMICOLON
                | returnstat SEMICOLON
                | ifstat
                | forstat
                | OPENBRACE statelist CLOSEBRACE
                | BREAK SEMICOLON
                | SEMICOLON;


vardecl         : vartype IDENT array;

vartype         : INT
                | FLOAT
                | STRING;

array           : OPENBRACKET INT_CONSTANT CLOSEBRACKET array
                | ;

atribstat       : lvalue EQUAL atribexpression;

atribexpression : expression
                | allocexpression
                | funccall;

funccall        : IDENT OPENPAR paramlistcall CLOSEPAR;

paramlistcall   : IDENT COMMA paramlistcall
                | IDENT
                | ;

printstat       : PRINT expression;

readstat        : READ lvalue;

returnstat      : RETURN;

ifstat          : IF OPENPAR expression CLOSEPAR statement elsestat;

elsestat        : ELSE statement
                | ;

forstat         : FOR OPENPAR atribstat SEMICOLON expression SEMICOLON atribstat CLOSEPAR statement;

statelist       : statement statelist
                | statement;

allocexpression : NEW vartype allocnumexp;

allocnumexp     : OPENBRACKET numexpression CLOSEBRACKET allocnumexp
                | OPENBRACKET numexpression CLOSEBRACKET;

expression      : numexpression comparator numexpression
                | numexpression;

comparator      : LESS
                | GREATER
                | LESSEQUAL
                | GREATEREQUAL
                | EQUALCOMP
                | DIFFERENT;

numexpression   : term numexpression2;

numexpression2  : minorarith term numexpression2
                | ;

term            : unaryexpr term2;

term2           : priorarith unaryexpr term2
                | ;

minorarith      : PLUS
                | MINUS;

priorarith      : MULTIPLY
                | DIVIDE
                | MODULE;

unaryexpr       : minorarith factor
                | factor;

factor          : INT_CONSTANT
                | FLOAT_CONSTANT
                | STRING_CONSTANT
                | NULL
                | lvalue
                | OPENPAR numexpression CLOSEPAR;

lvalue          : IDENT allocnumexp
                | IDENT;

LESS            : '<';
GREATER         : '>';
LESSEQUAL       : '<=';
GREATEREQUAL    : '>=';
EQUALCOMP       : '==';
DIFFERENT       : '!=';
PLUS            : '+';
MINUS           : '-';
MULTIPLY        : '*';
DIVIDE          : '/';
MODULE          : '%';

EQUAL           : '=';
SEMICOLON       : ';';
COMMA           : ',';
OPENPAR         : '(';
CLOSEPAR        : ')';
OPENBRACE       : '{';
CLOSEBRACE      : '}';
OPENBRACKET     : '[';
CLOSEBRACKET    : ']';

DEF             : 'def';
NEW             : 'new';
IF              : 'if';
ELSE            : 'else';
FOR             : 'for';
RETURN          : 'return';
BREAK           : 'break';
PRINT           : 'print';
READ            : 'read';

INT             : 'int';
FLOAT           : 'float';
STRING          : 'string';

NULL            : 'null';
IDENT           : [a-zA-Z_][a-zA-Z0-9_]*;
INT_CONSTANT    : [0-9]+;
STRING_CONSTANT : '"' .*? '"';
FLOAT_CONSTANT  : ('0'..'9')+ '.' ('0'..'9')+;

WS : [ \t\r\n]+ -> skip ;