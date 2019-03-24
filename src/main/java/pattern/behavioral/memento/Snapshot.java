package pattern.behavioral.memento;

/**
 * Se encarga de almacenar el estado de un objeto en un momento dado.
 */
public class Snapshot {

    private String command;

    public Snapshot(String command) {
        this.command = command;
    }

    public String getCommand() {
        return command;
    }

}
