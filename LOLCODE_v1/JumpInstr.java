// implementation of the jumpF instruction

import java.util.Stack;
import java.util.HashMap;

public class JumpInstr extends Instr {
    
    private String label;
    private HashMap table;

    public JumpInstr(String lab, HashMap tab) {
        label = lab;
        table = tab;
    }

    public void executeInstr() {
        // retrieve the requested instructions by label
        Instr i = (Instr)table.get(label);

        // and start executing.
        i.executeInstr();
    }
}
