grammar stack;

/* CSC402 assignment #4: an interpreter for an abstract stack machine language  */

@header {
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.Map;
import java.util.Stack;
}
@members{
    public Program program = new Program();
    public HashMap<String,Integer> memory = new HashMap<String,Integer>();
    public HashMap labelTable = new HashMap();
    public Stack<Integer> stack = new Stack<Integer>();
}

//**********************************************************************************
// grammar rules

prog 	
scope {
	// locak variable def in prog
	String currentLabelDef;
}
	:	(
			{ $prog::currentLabelDef = null; }
			(l=labelDef { $prog::currentLabelDef = $l.name; } )? 
			s=stmt 
			{ 
				if ($prog::currentLabelDef!=null) labelTable.put($prog::currentLabelDef,$s.instr); 
				program.addInstr($s.instr); 
			} 
		)+ 
	;

labelDef returns [String name]
	:	VAR ':' 		{ $name = $VAR.text; }
	;

stmt returns [Instr instr]
	:   'push'  (v=variable ';' { $instr = new VarInstr($v.name,stack,memory); }|
                 n=number ';' { $instr = new NumInstr($n.name,stack);})
	|   'store' v=variable ';' { $instr = new StoreInstr($v.name,memory,stack);}
    |   'pop' ';'              { $instr = new StackInstr(StackInstr.Operation.POP,stack); }
    |   'print' ';'            { $instr = new StackInstr(StackInstr.Operation.PRI,stack); }
    |   'ask' ';'              { $instr = new StackInstr(StackInstr.Operation.ASK,stack); }
    |   'dup' ';'              { $instr = new StackInstr(StackInstr.Operation.DUP,stack); }
    |   'add' ';'              { $instr = new MathInstr(MathInstr.Operation.ADD,stack); }
    |   'sub' ';'              { $instr = new MathInstr(MathInstr.Operation.SUB,stack); }
    |   'mul' ';'              { $instr = new MathInstr(MathInstr.Operation.MUL,stack); }
    |   'div' ';'              { $instr = new MathInstr(MathInstr.Operation.DIV,stack); }
    |   'equ' ';'              { $instr = new MathInstr(MathInstr.Operation.EQU,stack); }
    |   'leq' ';'              { $instr = new MathInstr(MathInstr.Operation.LEQ,stack); }
	|   'jumpT' l=label    ';' { $instr = new JumpTFInstr(true,$l.name,labelTable,stack); }
	|   'jumpF' l=label    ';' { $instr = new JumpTFInstr(false,$l.name,labelTable,stack); }
	|	'jump'  l=label    ';' { $instr = new JumpInstr($l.name,labelTable); }
    |   'noop' ';'             { $instr = new NoOpInstr(); }
	|   'stop'  m=message  ';' { $instr = new StopInstr($m.content); }
	;

number  returns [String name]    : NUM    { $name = $NUM.text; };
variable  returns [String name]    : VAR    { $name = $VAR.text; };	
label   returns [String name]    : VAR    { $name = $VAR.text; };
message returns [String content] : (STRING { $content = $STRING.text; })?;

/*************************\
\* the lexical situation */

VAR     : ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')* ;
NUM     : '-'? '0'..'9'+;
COMMENT : '//' ~('\n'|'\r')* '\r'? '\n'            {$channel=HIDDEN;};
WS      : ( ' ' | '\t' | '\r' | '\n' )             {$channel=HIDDEN;};
STRING  : '"' ( ESC_SEQ | ~('\\'|'"') )* '"' 
        {setText(getText().substring(1, getText().length()-1));};
ESC_SEQ : '\\' ('b'|'t'|'n'|'f'|'r'|'\"'|'\''|'\\');
