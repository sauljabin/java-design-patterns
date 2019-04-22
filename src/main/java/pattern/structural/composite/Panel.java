package pattern.structural.composite;

/**
 * Componente hoja (leaf)
 */
public class Panel extends Component {
    private String name;

    public Panel(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
        super.draw();
    }
}
