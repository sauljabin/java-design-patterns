package pattern.structural.adapter;

import java.util.Arrays;
import java.util.List;

public class AdapterExample {
    public static void main(String[] args) {
        Fahrenheit fahrenheit = new Fahrenheit(98.6);

        List<MetricTemperatureSystem> temperatureList = Arrays.asList(
                new Celsius(37),
                new CelsiusAdapter(fahrenheit)
        );

        System.out.println(fahrenheit);
        System.out.println(temperatureList);
    }
}
