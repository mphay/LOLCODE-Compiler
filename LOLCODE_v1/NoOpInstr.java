// noop

public class NoOpInstr extends Instr {

    public void executeInstr() {
	// transfer control to the next instuction
	executeNextInstr();
    }
}
