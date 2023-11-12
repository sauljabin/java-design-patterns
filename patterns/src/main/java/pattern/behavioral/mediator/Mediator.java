package pattern.behavioral.mediator;

import java.io.File;

/**
 * El mediador concentra el flujo de invocaciones de acciones y eventos.
 * Evita altas dependencias entre clases y código repetido.
 * El mediador conoce todos los objetos que desean comunicarse entre si.
 * Es especialmente utilizado para objetos heterogéneos (no es necesario que los colegas sean de la misma familia).
 * El método register podría recibir una generalización.
 * La responsabilidad del mediador tiene como alcance solamente dirigir el flujo de acciones entre objetos
 * más no directamente realizar las acciones por el mismo.
 */
public interface Mediator {
    void register(FileTree fileTree);

    void register(SpellChecker spellChecker);

    void register(TextEditor textEditor);

    void notifyFileSelected(File file);

    void notifyTextChange(String newText);

    void notifySpellingSuccess();

    void notifySpellingError();
}
