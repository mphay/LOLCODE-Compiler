// implementation of the store instruction

import java.util.Stack;
import java.util.HashMap;

public class StoreInstr extends Instr {

    private String                  variable;
    private HashMap<String,Integer> memory;
    private Stack<Integer>          stack;

    public StoreInstr(String var, HashMap<String,Integer> mem, Stack<Integer> sta) {
        variable = var;
        memory   = mem;
        stack    = sta;
    }

    public void executeInstr() {
        // pop a number off the top
        Integer integer = stack.pop();

        // place it inside a decorative case
        memory.put(variable,integer);
	// transfer control to the next instuction
	executeNextInstr();
    }
}
