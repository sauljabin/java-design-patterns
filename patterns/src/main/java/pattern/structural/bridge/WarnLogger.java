package pattern.structural.bridge;

/**
 * Clase que contiene la abstracción pero refinada.
 */
public class WarnLogger extends Logger {

    public WarnLogger(LoggerOutput loggerOutput) {
        super(loggerOutput);
    }

    @Override
    public void log(String message) {
        loggerOutput.output(String.format("WARN: %s", message));
    }
}
