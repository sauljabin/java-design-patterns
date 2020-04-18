package pattern.behavioral.command;

/**
 * Comando concreto pegar, al deshacer restaura el texto anterior.
 */
public class Paste implements Command {
    private Editor editor;
    private String backup;

    public Paste(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void execute() {
        backup = editor.getText();
        editor.setText(editor.getText() + editor.getClipboard());
    }

    @Override
    public void undo() {
        editor.setText(backup);
    }
}
