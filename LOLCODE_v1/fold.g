tree grammar fold;

//************************************************************************
// constant folder for the simple1 scripting language

options{
tokenVocab=simple1;		// use token definitions from simple1
output=AST;			// generate AST
ASTLabelType=CommonTree;	// use CommonTree AST
filter=true; 			// make it pattern matcher
}

bottomup:	 exp;  // make sure the children are folded first - postfix  tree walker

exp 	:	^('==' i=NUM j=NUM) -> ^(NUM[String.valueOf(($i.int==$j.int)?1:0)])
	| 	^('<=' i=NUM j=NUM) -> ^(NUM[String.valueOf(($i.int<=$j.int)?1:0)])
	|	^('+'  i=NUM j=NUM) -> ^(NUM[String.valueOf($i.int+$j.int)])
	| 	^('-'  i=NUM j=NUM) -> ^(NUM[String.valueOf($i.int-$j.int)])
 	|	^('*'  i=NUM j=NUM) -> ^(NUM[String.valueOf($i.int*$j.int)])
	| 	^('/'  i=NUM j=NUM) -> ^(NUM[String.valueOf($i.int/$j.int)])
	;
	


