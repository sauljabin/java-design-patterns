package pattern.structural.adapter;

import com.github.javafaker.Faker;
import org.assertj.core.util.DoubleComparator;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CelsiusAdapterTest {

    private static final double DOUBLE_PRECISION = 0.000001;
    private double random;

    @Before
    public void setUp() throws Exception {
        random = Faker.instance().number().randomDouble(2, 0, 100);
    }

    @Test
    public void shouldConvert32FahrenheitToCelsius() {
        Fahrenheit fahrenheit = new Fahrenheit(32);

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);

        assertThat(celsiusAdapter.getTemperature())
                .isEqualTo(0);
    }

    @Test
    public void shouldConvert0CelsiusToFahrenheit() {
        Fahrenheit fahrenheit = new Fahrenheit();

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);
        celsiusAdapter.setTemperature(0);

        assertThat(fahrenheit.getTemperature())
                .isEqualTo(32);
    }

    @Test
    public void shouldConvertRandomFahrenheitToCelsius() {
        Fahrenheit fahrenheit = new Fahrenheit(random);

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);

        assertThat(celsiusAdapter.getTemperature())
                .usingComparator(new DoubleComparator(DOUBLE_PRECISION))
                .isEqualTo((random - 32.) * 5. / 9.);
    }

    @Test
    public void shouldConvertRandomCelsiusToFahrenheit() {
        Fahrenheit fahrenheit = new Fahrenheit();

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);
        celsiusAdapter.setTemperature(random);

        assertThat(fahrenheit.getTemperature())
                .usingComparator(new DoubleComparator(DOUBLE_PRECISION))
                .isEqualTo(random * 9. / 5. + 32.);
    }
}