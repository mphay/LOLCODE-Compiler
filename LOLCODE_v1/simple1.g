grammar simple1;

//********************************************************
// variable definition usage analyzer and pretty printer
// for the simple1 scripting language
// this version uses ANTLR's AST mechanism

options{
output=AST;
ASTLabelType=CommonTree;
}

// we define some additional tokens that we 
// need for tree building
tokens{STMTLIST;BLOCKSTMT;}

@members{
// override the default error reporting functions
public void reportError(RecognitionException e) {
    // call the Parser member function to report the error
    displayRecognitionError(this.getTokenNames(), e);
    // exit with error
    System.exit(1);
}
}

prog 	:	(stmt)+ 					-> ^(STMTLIST stmt+)
	;

stmt	:	VAR '=' exp ';'?    				-> ^('=' VAR exp)
	|	'get' VAR ';'?      				-> ^('get' VAR)
	|	'put' exp ';'?      				-> ^('put' exp)
	|	'while' '(' exp ')' s=stmt  			-> ^('while' exp $s)
	|	'if' '(' exp ')' s1=stmt ( 'else' s2=stmt )?	-> ^('if' exp $s1 $s2?)
	|	'{' (stmt)+ '}'					-> ^(BLOCKSTMT stmt+)
	;

exp 	:	relexp
	;

relexp 	:	addexp (('==' ^ addexp) | ('<=' ^ addexp))* ;
addexp	:	mulexp (('+' ^ mulexp) | ('-' ^ mulexp))*  ;
mulexp 	:	atom (('*' ^ atom) | ('/' ^ atom))* ;

atom	:	'(' exp ')'   	-> exp
	|	VAR
	|	NUM	
	|	'-'v=NUM	-> ^(NUM["-"+$v.text])	
	;

//*************************************************************************
// lexical analyzer stuff
VAR  	:	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM 	:	'0'..'9'+;
COMMENT	:   	'//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;};
WS  	:   	( ' ' | '\t' | '\r' | '\n' ) {$channel=HIDDEN;};
STRING	:  	'"' ( ESC_SEQ | ~('\\'|'"') )* '"';
fragment // the following is not a real token just a rule for constructing strings
ESC_SEQ	:   	'\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');

