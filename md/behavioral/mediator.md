# Mediator

El patrón mediador permite reducir las dependencias caóticas entre los objetos.
El patrón restringe las comunicaciones directas entre los objetos 
y los obliga a colaborar sólo a través de un objeto mediador.

El mediador concentra el flujo de invocaciones de acciones y eventos.
Evita altas dependencias entre clases y código repetido.
El mediador conoce todos los objetos que desean comunicarse entre si.
Es especialmente utilizado para objetos heterogéneos (no es necesario que los colegas/colaboradores sean de la misma familia).
La responsabilidad del mediador tiene como alcance solamente dirigir el flujo de acciones entre objetos
más no directamente realizar las acciones por el mismo.

![mediator](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/mediator.png)

Ejemplo de uso:

```java
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
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/mediator)