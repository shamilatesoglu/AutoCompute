
grammar Unnamed;

compilationUnit
    :  entityDefinition EOF
    ;

entityDefinition
    : ENTITY identifier=ID LCURLY entityBody RCURLY
    ;

entityBody
    : (inputDeclaration)* (localVariableDefinition)* (entityDefinition)* (outputDefinition)*
    ;

inputDeclaration
    : IN identifier=ID (rangeExpression)? DOT
    ;

localVariableDefinition
    : identifier=ID ASSIGN expression (constraint)? DOT
    ;

outputDefinition
    : OUT identifier=ID ASSIGN expression (constraint)? DOT
    ;

constraint
    : GIVEN expression
    ;

rangeExpression
    : LBRACKET expression DOTDOT expression RBRACKET
    ;

expression
    :   '(' expression ')'                                                                      # parenthesisExpression
    |   operation=('+'|'-') expression                                                          # unaryExpression
    |   left=expression operation=('*'|'/') right=expression                                    # infixExpression
    |   left=expression operation=('+'|'-') right=expression                                    # infixExpression
    |   left=expression operation=('=='|'!='|'>'|'<'|'>='|'<='|'&&'|'||') right=expression      # infixExpression
    |   check=expression '?' first=expression ':' second=expression                             # conditionalExpression
    |   identifier=ID                                                                           # referenceExpression
    |   value=(NUM|BOOLEAN_LITERAL)                                                             # numberExpression
    ;


IN      : ('i'|'I')('n'|'N');
OUT     : ('o'|'O')('u'|'U')('t'|'T');
ENTITY  : ('e'|'E')('n'|'N')('t'|'T')('i'|'I')('t'|'T')('y'|'Y');
GIVEN   : ('g'|'G')('i'|'I')('v'|'V')('e'|'E')('n'|'N');

DOT     : '.';
DOTDOT  : '..';
ASSIGN  : ':=';
LCURLY  : '{';
RCURLY  : '}';
LBRACKET  : '[';
RBRACKET  : ']';

BOOLEAN_LITERAL
    : TRUE
    | FALSE
    ;

TRUE: ('TRUE'|'true');
FALSE: ('FALSE'|'false');

OPERATOR_ADD: '+';
OPERATOR_SUB: '-';
OPERATOR_MUL: '*';
OPERATOR_DIV: '/';
OPERATOR_AND: '&&';
OPERATOR_OR: '||';
OPERATOR_EQ: '==';
OPERATOR_NEQ: '!=';
OPERATOR_GT: '>' ;
OPERATOR_LT: '<' ;
OPERATOR_GTEQ: '>=';
OPERATOR_LTEQ: '<=';

NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z_0-9]+;
WS  :   [ \t\r\n] -> channel(HIDDEN);



/*
compilationUnit
    :  setDeclaration EOF
    ;

setDeclaration
    : 'set' variable '{' setBlock '}'
    ;

inputDeclaration
    : 'in' variable  (range)? '.'
    ;

range
    : 'within' '[' left=expression '..' right=expression ']' # rangeExpression
    ;


variable
    : ID
    ;

outputDeclaration
    : 'out' assignmentExpression
    ;

assignmentExpression
    : variable ':=' expression '.'
    ;

expression
    :   '(' expression ')'                                                         # parenthesisExpression
    |   operation=('+'|'-') expression                                             # unaryExpression
    |   left=expression operation=('*'|'/') right=expression                       # infixExpression
    |   left=expression operation=('+'|'-') right=expression                       # infixExpression
    |   left=expression operation=('=='|'!='|'>'|'<'|'>='|'<=') right=expression   # booleanExpression
    |   check=expression '?' first=expression ':' second=expression                # conditionalExpression
    |   variable                                                                   # variableExpression
    |   value=(NUM|BOOLEAN_LITERAL)                                                # numberExpression
    ;

setBlock
    : (inputDeclaration)* (assignmentExpression)* (setDeclaration)* (outputDeclaration)
    ;

OPERATOR_ADD: '+';
OPERATOR_SUB: '-';
OPERATOR_MUL: '*';
OPERATOR_DIV: '/';
OPERATOR_EQ: '==';
OPERATOR_NEQ: '!=';
OPERATOR_GT: '>' ;
OPERATOR_LT: '<' ;
OPERATOR_GTEQ: '>=';
OPERATOR_LTEQ: '<=';

BOOLEAN_LITERAL
    :'true'
    |'false'
    ;


NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z_0-9]+;
WS  :   [ \t\r\n] -> channel(HIDDEN);*/