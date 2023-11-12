package pattern.structural.bridge;

/**
 * Clase implementadora concreta (Concrete implementor).
 */
public class FileLoggerOutput implements LoggerOutput {

    private String path;

    public FileLoggerOutput(String path) {
        this.path = path;
    }

    @Override
    public void output(String message) {
        System.out.printf("File: %s\n%s\n", path, message);
    }
}
