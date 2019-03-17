package pattern.behavioral.memento;

public class MementoExample {

    public static void main(String[] args) {
        History history = new History();

        Console console = new Console();

        console.setCommand("ls -la");
        history.addSnapshot(console.generateSnapshot());

        console.setCommand("cd ..");
        history.addSnapshot(console.generateSnapshot());

        console.restoreFromSnapshot(history.getSnapshot(0));

        console.exec(); // Salida: Exec command: ls -la
    }

}
