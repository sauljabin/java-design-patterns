package pattern.structural.adapter;

/**
 * Objeto incompatible
 */
public class Fahrenheit implements ImperialTemperatureSystem {
    private double temperature;

    public Fahrenheit() {
    }

    public Fahrenheit(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public double getTemperature() {
        return temperature;
    }

    @Override
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return String.format("%s° F", temperature);
    }
}
