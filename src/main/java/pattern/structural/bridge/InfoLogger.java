package pattern.structural.bridge;

/**
 * Clase que contiene la abstracción pero refinada.
 */
public class InfoLogger extends Logger {

    public InfoLogger(LoggerOutput loggerOutput) {
        super(loggerOutput);
    }

    @Override
    public void log(String message) {
        loggerOutput.output(String.format("INFO: %s", message));
    }
}
