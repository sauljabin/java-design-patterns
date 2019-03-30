package pattern.structural.adapter;

import org.assertj.core.util.DoubleComparator;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CelsiusAdapterTest {

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
        double random = Math.random();
        Fahrenheit fahrenheit = new Fahrenheit(random);

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);

        assertThat(celsiusAdapter.getTemperature())
                .usingComparator(new DoubleComparator(0.000001))
                .isEqualTo((random - 32.) * 5. / 9.);
    }

    @Test
    public void shouldConvertRandomCelsiusToFahrenheit() {
        double random = Math.random();
        Fahrenheit fahrenheit = new Fahrenheit();

        CelsiusAdapter celsiusAdapter = new CelsiusAdapter(fahrenheit);
        celsiusAdapter.setTemperature(random);

        assertThat(fahrenheit.getTemperature())
                .usingComparator(new DoubleComparator(0.000001))
                .isEqualTo(random * 9. / 5. + 32.);
    }
}