package pattern.behavioral.command;

public class CommandDemo {
    public static void main(String[] args) {
        IDE ide= new IDE();

        ide.getEditor().setText("Hola mundo!");
        ide.getEditor().setSelectedText("mundo");

        ide.clickOnCopyButton();
        ide.shortcutPasteButton();
        System.out.println(ide.getEditor().getText());

        ide.clickOnUndo();
        System.out.println(ide.getEditor().getText());
    }
}
