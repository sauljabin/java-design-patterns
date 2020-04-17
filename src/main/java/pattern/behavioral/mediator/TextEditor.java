package pattern.behavioral.mediator;

import java.io.File;

/**
 * Este es un objeto colega (college) ya que esa un mediador.
 * Puede o no pertenecer a una familia (heredar de una clase o interfaz 'Component', 'College', etc.
 */
public class TextEditor {
    private Mediator mediator;
    private File file;

    public TextEditor(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    /**
     * El método es invocado por el mediador cuando sea necesario.
     */
    public void loadFile(File file) {
        this.file = file;
        System.out.println("TextEditor: Cargando archivo " + file);
    }

    public void appendText(String newText) {
        System.out.println("TextEditor: Se agrega nuevo texto \"" + newText + "\" al archivo  " + file);
        mediator.notifyTextChange(newText);
    }
}
