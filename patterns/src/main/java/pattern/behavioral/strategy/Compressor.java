package pattern.behavioral.strategy;

import java.io.File;
import java.util.List;

/**
 * Clase de contexto. Es la clase que ejecuta el algoritmo a través de la clase
 * strategy.
 */
public class Compressor {
    private CompressionFormat compressionFormat;

    public void setCompressionFormat(CompressionFormat compressionFormat) {
        this.compressionFormat = compressionFormat;
    }

    public void compress(List<File> files) {
        compressionFormat.compress(files);
    }
}
