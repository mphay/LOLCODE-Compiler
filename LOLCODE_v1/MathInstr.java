// binary mathematical operations 

import java.util.Stack;
import java.util.EmptyStackException;

public class MathInstr extends Instr {

    public enum Operation {
        ADD { Integer eval(Integer one, Integer two) { return two + one;       } },
        SUB { Integer eval(Integer one, Integer two) { return two - one;       } },
        MUL { Integer eval(Integer one, Integer two) { return two * one;       } },
        DIV { Integer eval(Integer one, Integer two) { return two / one;       } },
        EQU { Integer eval(Integer one, Integer two) { return (two==one)? 1:0; } },
        LEQ { Integer eval(Integer one, Integer two) { return (two<=one)? 1:0; } };
        
        abstract Integer eval(Integer one, Integer two);
    }

    private Operation operation;
    private Stack<Integer> stack;

    public MathInstr(Operation ope, Stack<Integer> sta) {
        operation = ope;
        stack = sta;
    }
    public void executeInstr() {
        try {
            Integer one = stack.pop();
            Integer two = stack.pop();
            Integer three = operation.eval(one, two);

            stack.push(three);

            executeNextInstr();

        } catch(EmptyStackException exception) {
            System.err.println("you've got too few numbers to do the math you've asked for.");
        }
    }
}
