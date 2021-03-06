
grammar AutoCompute;

compilationUnit
    :  (entityDefinition)* (computeCall)* (entityDefinition)*  EOF
    ;

entityDefinition
    : ENTITY identifier=ID LCURLY entityBody RCURLY
    ;

entityBody
    : (propertyDefinition)* (constraintsDefinition)* (inputDeclaration)* (localVariableDefinition)* (entityDefinition)* (outputDefinition)*
    ;

// TODO: Interpreter output format doesn't currently make use of this.
propertyDefinition
    : identifier=ID COLON value=(STRING_LITERAL|NUM) DOT
    ;

inputDeclaration
    : IN identifier=ID (rangeExpression)? DOT
    ;

localVariableDefinition
    : identifier=ID ASSIGN expression (given)? DOT
    ;

outputDefinition
    : OUT identifier=ID ASSIGN expression (given)? DOT
    ;

given
    : GIVEN LCURLY (constraint)* RCURLY
    | GIVEN reference
    ;

constraint
    : expression (COMMA rationale=STRING_LITERAL)? DOT
    ;

constraintsDefinition
    : CONSTRAINTS identifier=ID LCURLY (constraint)* RCURLY DOT
    ;

rangeExpression
    : LBRACKET expression DOTDOT expression RBRACKET
    ;

computeCall
    : COMPUTE reference LCURLY (inputDefinition)* RCURLY DOT
    ;

inputDefinition
    : reference OPERATOR_IN expression DOT
    ;

reference
    : ID ('::' ID)*
    ;

expression
    :   '(' expression ')'                                                                      # parenthesisExpression
    |   operation=('+'|'-') expression                                                          # unaryExpression
    |   left=expression operation='^' right=expression                                          # infixExpression
    |   left=expression operation=('*'|'/') right=expression                                    # infixExpression
    |   left=expression operation=('+'|'-') right=expression                                    # infixExpression
    |   left=expression operation=('=='|'!='|'>'|'<'|'>='|'<=') right=expression                # infixExpression
    |   left=expression operation=('&&'|'||') right=expression                                  # infixExpression
    |   check=expression '?' first=expression ':' second=expression                             # conditionalExpression
    |   reference                                                                               # referenceExpression
    |   value=(NUM|BOOLEAN_LITERAL)                                                             # numberExpression
    ;

STRING_LITERAL: '"' ( ESC | ~[\\"\r\n] )* '"';

fragment ESC : '\\"' | '\\\\' ;

IN      : ('i'|'I')('n'|'N');
OUT     : ('o'|'O')('u'|'U')('t'|'T');
ENTITY  : ('e'|'E')('n'|'N')('t'|'T')('i'|'I')('t'|'T')('y'|'Y');
GIVEN   : ('g'|'G')('i'|'I')('v'|'V')('e'|'E')('n'|'N');
CONSTRAINTS : ('c'|'C')('o'|'O')('n'|'N')('s'|'S')('t'|'T')('r'|'R')('a'|'A')('i'|'I')('n'|'N')('t'|'T')('s'|'S');
COMPUTE   : ('c'|'C')('o'|'O')('m'|'M')('p'|'P')('u'|'U')('t'|'T')('e'|'E');

DOT     : '.';
DOTDOT  : '..';
ASSIGN  : ':=';
LCURLY  : '{';
RCURLY  : '}';
LBRACKET  : '[';
RBRACKET  : ']';
COMMA   : ',';
COLON   : ':';

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
OPERATOR_SCOPE: '::';
OPERATOR_IN   : '<<';
OPERATOR_EXP   : '^';

NUM :   [0-9]+ ('.' [0-9]+)? ([eE] [+-]? [0-9]+)?;
ID  :   [a-zA-Z_0-9]+;

COMMENT
    : '/*' .*? '*/' -> skip
;

LINE_COMMENT
    : '//' ~[\r\n]* -> skip
;

WS  :   [ \t\r\n] -> channel(HIDDEN);