package pattern.structural.flyweight;

import java.awt.*;

/**
 * La clase flyweight, contienen la parte intrínsica.
 */
public class TreeType {
    private String name;
    private Color color;

    public TreeType(String name, Color color) {
        this.name = name;
        this.color = color;
    }

    public void draw(int x, int y) {
        System.out.printf("TreeType: %s %s %s %s\n", name, color, x, y);
    }
}
