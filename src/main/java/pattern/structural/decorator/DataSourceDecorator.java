package pattern.structural.decorator;

/**
 * Clase base decoradora que se usará como padre de otras decoradoras,
 * tiene como objetivo ser un wrapper del componente original
 */
public class DataSourceDecorator implements DataSource {
    private DataSource source;

    DataSourceDecorator(DataSource source) {
        this.source = source;
    }

    @Override
    public void writeData(String data) {
        source.writeData(data);
    }

    @Override
    public String readData() {
        return source.readData();
    }
}
