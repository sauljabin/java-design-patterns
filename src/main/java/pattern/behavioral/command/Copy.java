package pattern.behavioral.command;

/**
 * Comando concreto, en este caso no se necesita el 'undo'.
 */
public class Copy implements Command {
    private Editor editor;

    public Copy(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        editor.setClipboard(editor.getSelectedText());
    }

    @Override
    public void undo() {
        // Nada
    }
}
