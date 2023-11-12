package pattern.structural.bridge;

/**
 * Interfaz implementadora, permite tener el segundo grupos de clases.
 * Separa parte de la lógica.
 */
public interface LoggerOutput {
    void output(String message);
}
