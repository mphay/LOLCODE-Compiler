// stop.

public class StopInstr extends Instr {

    private String message;
    public StopInstr(String mes) {
        message = mes;
    }

    public void executeInstr() {
	// HALT EXECUTION
        if(message == null) {
            System.out.println("it's all over now, baby blue.");
        } else {
            System.out.println(message);
        }
    }
}
