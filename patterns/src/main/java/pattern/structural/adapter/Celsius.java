package pattern.structural.adapter;

public class Celsius implements MetricTemperatureSystem {
    private double temperature;

    public Celsius() {
    }

    public Celsius(double temperature) {
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
        return String.format("%s° C", temperature);
    }
}
