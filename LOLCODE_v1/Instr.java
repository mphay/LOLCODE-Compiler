// abstract base class for our bytecode instruction set

public abstract class Instr {

    private Instr nextInstr = null;

    public Instr() {
	nextInstr = null;
    }

    public Instr(Instr i) {
	nextInstr = i;
    }

    public void putNext(Instr i) {
	nextInstr = i;
    }

    public abstract void executeInstr();

    public final void executeNextInstr() {
	if (nextInstr != null) {
	    nextInstr.executeInstr();
	}
	else {
	    System.out.println("Execution all done.");
	}
    }
}

