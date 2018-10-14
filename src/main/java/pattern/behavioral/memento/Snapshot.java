package pattern.behavioral.memento;

public class Snapshot {
    
    private String command;

    public Snapshot(String command) {
	this.command = command;
    }

    public String getCommand() {
        return command;
    }
    
}
