package pattern.structural.decorator;

public class DecoratorExample {
    public static void main(String[] args) {
        ConsoleDataSource consoleDataSource = new ConsoleDataSource();
        String data = consoleDataSource.readData();
        consoleDataSource.writeData(data);

        EncryptionDecorator encryptionDecorator = new EncryptionDecorator(consoleDataSource);
        encryptionDecorator.writeData(data);
    }
}
