// implements the executable list of machine instructions

public class Program {

    private Instr firstInstr = null;
    private Instr currentInstr = null;

    public void addInstr(Instr i) {
	if (firstInstr == null) {
	    firstInstr = i;
	    currentInstr = i;
	}
	else {
	    currentInstr.putNext(i);
	    currentInstr = i;
	}
    }

    public void run() {
	firstInstr.executeInstr();
    }

}