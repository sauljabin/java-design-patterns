package pattern.structural.composite;

/**
 * Componente principal
 */
public class Window extends Component {
    private String name;

    public Window(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
        super.draw();
    }
}
