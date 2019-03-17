package pattern.creational.prototype;

import java.awt.*;

/**
 * Clase prototype, los hijos deben implementar el método clone. Además, se crea
 * un constructor que recibe como parametro otra Shape que servirá de base.
 */
public abstract class Shape {
    private Color color;
    private double x;
    private double y;

    public Shape() {
    }

    public Shape(Shape base) {
        color = base.color;
        x = base.x;
        y = base.y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public abstract Shape clone();
}
