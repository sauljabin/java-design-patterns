package pattern.structural.flyweight;

import java.awt.*;

public class FlyweightExample {
    public static void main(String[] args) {
        TreeType type = TreeTypeFactory.getTreeType("Autumn Oak", Color.YELLOW);
        Tree tree1 = new Tree(10, 10, type);
        Tree tree2 = new Tree(20, 20, type);

        tree1.draw();
        tree2.draw();
    }
}
