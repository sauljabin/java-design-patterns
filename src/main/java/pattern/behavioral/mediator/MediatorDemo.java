package pattern.behavioral.mediator;

import java.io.File;

public class MediatorDemo {

    public static void main(String[] args) {
        Mediator mediator = new GuiController();

        FileTree fileTree = new FileTree(mediator);
        TextEditor textEditor = new TextEditor(mediator);
        SpellChecker spellChecker = new SpellChecker(mediator);

        fileTree.selectedFile(new File("README.md"));
        textEditor.appendText("Hola Mundo!");
    }
}
