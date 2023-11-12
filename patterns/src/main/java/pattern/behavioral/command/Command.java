package pattern.behavioral.command;

/**
 * La acción a realizar es ahora una clase.
 */
public interface Command {
    void execute();
    void undo();
}
