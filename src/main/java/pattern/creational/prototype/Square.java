package pattern.creational.prototype;

public class Square extends Shape {
    private double width;
    private double height;

    public Square() {
    }

    public Square(Square base) {
        super(base);
        width = base.width;
        height = base.height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public Shape clone() {
        return new Square(this);
    }
}
