package pattern.creational.prototype;

public class Circle extends Shape {
    private double radius;

    public Circle() {
    }

    public Circle(Circle base) {
        super(base);
        radius = base.radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }
}
