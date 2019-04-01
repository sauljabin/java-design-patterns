package pattern.structural.bridge;

/**
 * Clase que contiene la abstracción pero refinada.
 */
public class ErrorLogger extends Logger {

    public ErrorLogger(LoggerOutput loggerOutput) {
        super(loggerOutput);
    }

    @Override
    public void log(String message) {
        loggerOutput.output(String.format("ERROR: %s", message));
    }
}

