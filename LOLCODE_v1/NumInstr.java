// pushes a number into the stack

import java.util.Stack;
import java.util.HashMap;

public class NumInstr extends Instr {

    private String variable;
    private static Stack<Integer> stack;

    public NumInstr(String var, Stack<Integer> sta) {
        variable = var; // System.out.println(num);
        stack  = sta;
    }

    public void executeInstr() {
        // throw the number on top of the stack
        Integer integer = Integer.parseInt(variable);
        stack.push(integer);

	// transfer control to the next instuction
	executeNextInstr();
    }
}
