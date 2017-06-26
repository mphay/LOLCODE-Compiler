// playing games with the stack

import java.util.Stack;
import java.util.EmptyStackException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class StackInstr extends Instr {

    private Operation operation;
    private static Stack<Integer> stack;

    public enum Operation {
        POP { void eval() { 
                stack.pop(); }
            },
        PRI { void eval() {
                System.out.println("> "+stack.pop()); }
            }, 
        ASK { void eval() { 
                System.out.print("A value, please? ");
                try { stack.push(getInput()); }
                catch (IOException exception) {
                    System.err.println("communications malfunction, sorry, bye"); } }
            },
        DUP { void eval() { 
                Integer ephemera = stack.pop();
                stack.push(ephemera);
                stack.push(ephemera); }
            };

        abstract void eval();
    }
    
    public StackInstr(Operation ope, Stack<Integer> sta) {
        operation = ope;
        stack = sta;
    }
    public void executeInstr() {
        try {
            operation.eval();
            executeNextInstr();

        } catch(EmptyStackException exception) {
            System.err.println("I'm afraid you've run out of numbers.");
        }
    }
    private static Integer getInput() throws IOException {
        try {
            InputStreamReader stream = new InputStreamReader(System.in);
            BufferedReader reader = new BufferedReader(stream);

            return Integer.parseInt(reader.readLine());

        } catch (NumberFormatException exception) {
            System.err.println("that is not a number. enter a number.");
            return getInput();
        }
    }
}
