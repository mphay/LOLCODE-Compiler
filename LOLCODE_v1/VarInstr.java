// pushes a variable's value onto the stack

import java.util.Stack;
import java.util.HashMap;

public class VarInstr extends Instr {

    private String variable;
    private static Stack<Integer> stack;
    private HashMap<String,Integer> memory;

    public VarInstr(String var, Stack<Integer> sta, HashMap<String,Integer> mem) {
        variable = var; // System.out.println(num);
        stack  = sta;
        memory = mem; 
    }

    public void executeInstr() {
        // throw the number on top of the stack
        Integer number = memory.get(variable);
        stack.push(number);

	// transfer control to the next instuction
	executeNextInstr();
    }
}
