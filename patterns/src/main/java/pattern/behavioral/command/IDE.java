package pattern.behavioral.command;

/**
 * Clase "Invoker".
 */
public class IDE {
    private Command copyCommand;
    private Command pasteCommand;
    private Command undoCommand;
    private Editor editor;

    public IDE() {
        editor = new Editor();
        copyCommand = new Copy(editor);
        pasteCommand = new Paste(editor);
    }

    public Editor getEditor() {
        return editor;
    }

    /**
     * Los comandos pueden ser invocados desde diferentes eventos, como clic a un botón
     * o un shortcut.
     */

    public void clickOnCopyButton() {
        executeCommand(copyCommand);
    }

    public void clickOnPasteButton() {
        executeCommand(pasteCommand);
    }

    public void shortcutCopyButton() {
        executeCommand(copyCommand);
    }

    public void shortcutPasteButton() {
        executeCommand(pasteCommand);
    }

    private void executeCommand(Command copyCommand) {
        copyCommand.execute();
        undoCommand = copyCommand;
    }

    /**
     * En caso de necesitar el estado anterior.
     * También se puede incluir un patrón memento.
     */
    public void clickOnUndo() {
        undoCommand.undo();
    }
}
