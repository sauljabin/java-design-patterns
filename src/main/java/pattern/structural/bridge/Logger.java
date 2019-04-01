package pattern.structural.bridge;

/**
 * Abstración, contiene el comportamiento core del conjunto de clases.
 * Contiene la referencia al otro conjunto de clases (implementadores).
 */
abstract class Logger {
    protected final LoggerOutput loggerOutput;

    public Logger(LoggerOutput loggerOutput) {
        this.loggerOutput = loggerOutput;
    }

    public abstract void log(String message);
}
