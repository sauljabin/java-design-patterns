package pattern.creational.prototype;

import static org.assertj.core.api.Assertions.assertThat;

import java.awt.Color;
import java.util.Random;

import org.junit.Before;
import org.junit.Test;

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

	assertThat(circle).isNotEqualTo(circle.clone());
    }

    @Test
    public void shouldGetTheSameValuesOfShape() {
	Circle circle = new Circle();
	circle.setX(x);
	circle.setY(y);
	circle.setColor(color);

	Shape clone = circle.clone();

	assertThat(clone.getX()).isEqualTo(x);
	assertThat(clone.getY()).isEqualTo(y);
	assertThat(clone.getColor()).isEqualTo(color);
    }

    @Test
    public void shouldGetTheSameValuesOfOriginalCircle() {
	Circle circle = new Circle();
	circle.setRadius(radius);

	Circle clone = (Circle) circle.clone();

	assertThat(clone.getRadius()).isEqualTo(radius);
    }
}