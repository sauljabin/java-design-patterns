package pattern.behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 * Interfaz strategy. Encapsula un comportamiento (algoritmo) dentro de una
 * clase. Permite tener diferentes comportamientos para una familia de clases.
 */
public interface CompressionFormat {
    void compress(List<File> files);
}
