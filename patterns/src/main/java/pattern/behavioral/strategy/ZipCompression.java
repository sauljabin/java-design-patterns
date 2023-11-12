package pattern.behavioral.strategy;

import java.io.File;
import java.util.List;

public class ZipCompression implements CompressionFormat {
    @Override
    public void compress(List<File> files) {
        System.out.printf("Compressing %s with zip format", files);
    }
}
