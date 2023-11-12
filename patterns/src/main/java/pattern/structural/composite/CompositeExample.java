package pattern.structural.composite;

/**
 * Se pueden agregar componentes dentro de otros. Un ejemplo es la
 * composición de interfaces gráficas.
 */
public class CompositeExample {
    public static void main(String[] args) {
        Window window = new Window("Main Window");

        Panel firstPanel = new Panel("First Panel");
        firstPanel.add(new Label("Label in First Panel"));
        window.add(firstPanel);

        Panel secondPanel = new Panel("Second Panel");
        secondPanel.add(new Label("Label in Second Panel"));
        window.add(secondPanel);

        window.draw();
    }
}
