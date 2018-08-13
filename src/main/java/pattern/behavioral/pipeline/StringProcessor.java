package pattern.behavioral.pipeline;

/**
 * Interfaz que representa las etapas del pipeline.
 * Se puede usar genéricos para que sea más reutilizable.
 * Se puede usar la clase Object o crear Wrappers para la entrada y salida.
 */
public interface StringProcessor {
    String execute(String input);
}
