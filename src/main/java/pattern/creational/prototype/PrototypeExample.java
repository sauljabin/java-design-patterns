package pattern.creational.prototype;

import java.awt.*;

public class PrototypeExample {
    public static void main(String[] args) {
        Square square = new Square();
        square.setWidth(100);
        square.setHeight(100);
        square.setX(20);
        square.setY(20);
        square.setColor(Color.BLACK);

        System.out.printf("Original object: %s, new object: %s\n", square, square.clone()); // Salida ejemplo: Original
        // object:
        // pattern.creational.prototype.Square@39a054a5,
        // new object:
        // pattern.creational.prototype.Square@71bc1ae4
    }
}
