package pattern.structural.composite;


import java.util.ArrayList;
import java.util.List;

/**
 * Clase componente o contenedora. Cada componente puede contener
 * otros componentes.
 */
public abstract class Component {
    protected List<Component> components = new ArrayList<>();

    public void add(Component component) {
        components.add(component);
    }

    public void remove(Component component) {
        components.remove(component);
    }

    public void draw() {
        components.stream()
                .forEach(Component::draw);
    }

}
