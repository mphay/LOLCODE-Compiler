// jumps or not depending on popped value

import java.util.Stack;
import java.util.HashMap;

public class JumpTFInstr extends Instr {
    
    private String label;
    private HashMap table;
    private Stack<Integer> stack;
    private boolean trueOrFalse;

    public JumpTFInstr(boolean tOrF, String lab, HashMap tab, Stack<Integer> sta) {
        trueOrFalse = tOrF;
        label = lab;
        table = tab;
        stack = sta;
    }

    public void executeInstr() {
	// pop the stack's top
	Integer top = stack.pop();
	
	// if trueOrFalse is true, jump to given label unless top == 0
        // if trueOrFalse is false, jump to given label only if top == 0
	if ((top != 0) == trueOrFalse) {
	    Instr i = (Instr)table.get(label);
	    // start executing this instruction
	    i.executeInstr();
	} 
	else {
	    executeNextInstr();
	}
    }
}
