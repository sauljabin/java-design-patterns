package pattern.structural.composite;

/**
 * Componente hoja (leaf)
 */
public class Label extends Component {
    private String name;

    public Label(String name) {
        this.name = name;
    }

    @Override
    public void draw() {
        System.out.println(name);
        super.draw();
    }
}
