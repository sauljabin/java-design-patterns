package pattern.behavioral.templatemethod;

public class Rocket extends Animatable {

    @Override
    public void animate() {
        setX(getX() + 1);
        setY(getY() + 1);
    }

    @Override
    public void paint() {
        System.out.printf("Rocket in: (%d,%d)\n", getX(), getY());
    }
}
