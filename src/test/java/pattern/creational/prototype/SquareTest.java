package pattern.creational.prototype;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;
import java.util.Random;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class SquareTest {
    private Random random;
    private double x;
    private double y;
    private Color color;
    private double width;
    private double height;

    @Before
    public void setUp() {
        random = new Random();
        x = random.nextDouble();
        y = random.nextDouble();
        width = random.nextDouble();
        height = random.nextDouble();
        color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
    }

    @Test
    public void shouldGetNewInstance() {
        Square square = new Square();

        assertThat(square, is(not(square.clone())));
    }

    @Test
    public void shouldGetTheSameValuesOfShape() {
        Square square = new Square();
        square.setX(x);
        square.setY(y);
        square.setColor(color);

        Shape clone = square.clone();

        assertThat(clone.getX(), is(x));
        assertThat(clone.getY(), is(y));
        assertThat(clone.getColor(), is(color));
    }

    @Test
    public void shouldGetTheSameValuesOfOriginalSquare() {
        Square square = new Square();
        square.setWidth(width);
        square.setHeight(height);

        Square clone = (Square) square.clone();

        assertThat(clone.getWidth(), is(width));
        assertThat(clone.getHeight(), is(height));
    }
}