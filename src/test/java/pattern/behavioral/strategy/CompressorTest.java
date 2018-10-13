package pattern.behavioral.strategy;

import static org.mockito.Mockito.verify;

import java.io.File;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class CompressorTest {
    @Mock
    private List<File> files;

    @Mock
    private CompressionFormat format;

    @Test
    public void shouldInvokeCompressionMethod() {
	Compressor compressor = new Compressor();
	compressor.setCompressionFormat(format);

	compressor.compress(files);

	verify(format).compress(files);
    }
}