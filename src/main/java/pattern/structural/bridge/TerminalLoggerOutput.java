package pattern.structural.bridge;

/**
 * Clase implementadora concreta (Concrete implementor).
 */
public class TerminalLoggerOutput implements LoggerOutput {
    @Override
    public void output(String message) {
        System.out.println(message);
    }
}
