package pattern.creational.prototype;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class CircleTest {
    private Random random;
    private double x;
    private double y;
    private Color color;
    private double radius;

    @Before
    public void setUp() {
        random = new Random();
        x = random.nextDouble();
        y = random.nextDouble();
        radius = random.nextDouble();
        color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Test
    public void shouldGetNewInstance() {
        Circle circle = new Circle();

        assertThat(circle, is(not(circle.clone())));
    }

    @Test
    public void shouldGetTheSameValuesOfShape() {
        Circle circle = new Circle();
        circle.setX(x);
        circle.setY(y);
        circle.setColor(color);

        Shape clone = circle.clone();

        assertThat(clone.getX(), is(x));
        assertThat(clone.getY(), is(y));
        assertThat(clone.getColor(), is(color));
    }

    @Test
    public void shouldGetTheSameValuesOfOriginalCircle() {
        Circle circle = new Circle();
        circle.setRadius(radius);

        Circle clone = (Circle) circle.clone();

        assertThat(clone.getRadius(), is(radius));
    }
}