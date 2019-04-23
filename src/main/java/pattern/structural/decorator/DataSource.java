package pattern.structural.decorator;

/**
 * Interface principal, que permite definir componentes concretos y
 * decorators
 */
public interface DataSource {
    void writeData(String data);

    String readData();
}
