package pattern.behavioral.memento;

/**
 * Clase que usa mememto. Genera snapshots continuos.
 */
public class Console {

    private String command;

    public void setCommand(String command) {
        this.command = command;
    }

    public void exec() {
        System.out.printf("Exec command: %s", command);
    }

    public Snapshot generateSnapshot() {
        return new Snapshot(command);
    }

    public void restoreFromSnapshot(Snapshot snapshot) {
        this.command = snapshot.getCommand();
    }

}
