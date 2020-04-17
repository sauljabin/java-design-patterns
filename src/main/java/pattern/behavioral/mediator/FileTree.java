package pattern.behavioral.mediator;

import java.io.File;

/**
 * Este es un objeto colega (college) ya que esa un mediador.
 * Puede o no pertenecer a una familia (heredar de una clase o interfaz 'Component', 'College', etc.
 */
public class FileTree {
    private Mediator mediator;
    private File selectedFile;

    public FileTree(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    /**
     * El método se encargará de realizar las acciones correspondientes al dominio de la clase,
     * posteriormente utilizará el mediador para avisar a los otros colega (en el ejemplo componentes gráficos)
     * de la acción.
     */
    public void selectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
        System.out.println("FileTree: " + selectedFile + " fue seleccionado");
        mediator.notifyFileSelected(selectedFile);
    }

    public void highlightSuccess() {
        System.out.println("FileTree: Resaltando de VERDE el archivo " + selectedFile);
    }

    public void highlightError() {
        System.out.println("FileTree: Resaltando de ROJO el archivo " + selectedFile);
    }
}
