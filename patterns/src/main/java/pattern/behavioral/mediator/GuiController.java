package pattern.behavioral.mediator;

import java.io.File;

public class GuiController implements Mediator {
    private FileTree fileTree;
    private TextEditor textEditor;
    private SpellChecker spellChecker;

    @Override
    public void register(FileTree fileTree) {
        this.fileTree = fileTree;
    }

    @Override
    public void register(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    @Override
    public void register(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    @Override
    public void notifyFileSelected(File file) {
        textEditor.loadFile(file);
    }

    @Override
    public void notifyTextChange(String newText) {
        spellChecker.check(newText);
    }

    @Override
    public void notifySpellingSuccess() {
        fileTree.highlightSuccess();
    }

    @Override
    public void notifySpellingError() {
        fileTree.highlightError();
    }
}
