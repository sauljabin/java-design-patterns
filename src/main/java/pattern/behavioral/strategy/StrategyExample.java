package pattern.behavioral.strategy;

import static java.util.Arrays.asList;

import java.io.File;

public class StrategyExample {
    public static void main(String[] args) {
	Compressor compressor = new Compressor();
	compressor.setCompressionFormat(new ZipCompression());
	
	compressor.compress(asList(new File("README.md"))); // Salida: Compressing [README.md] with zip format
    }
}
