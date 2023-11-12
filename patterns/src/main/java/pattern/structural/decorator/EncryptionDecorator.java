package pattern.structural.decorator;

import java.util.Base64;

/**
 * Clase decoradora
 */
public class EncryptionDecorator extends DataSourceDecorator {

    EncryptionDecorator(DataSource source) {
        super(source);
    }

    @Override
    public void writeData(String data) {
        super.writeData(Base64.getEncoder().encodeToString(data.getBytes()));
    }

    @Override
    public String readData() {
        return new String(Base64.getDecoder().decode(super.readData()));
    }
}
