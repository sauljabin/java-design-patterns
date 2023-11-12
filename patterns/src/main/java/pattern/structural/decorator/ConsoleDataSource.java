package pattern.structural.decorator;

import java.util.Scanner;

/**
 * Ejemplo de componente concreto
 */
public class ConsoleDataSource implements DataSource {

    @Override
    public void writeData(String data) {
        System.out.println(data);
    }

    @Override
    public String readData() {
        return new Scanner(System.in).nextLine();
    }
}
