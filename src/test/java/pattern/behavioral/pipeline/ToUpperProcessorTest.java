package pattern.behavioral.pipeline;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class ToUpperProcessorTest {
    @Test
    public void shouldConvertStringToUpper() {
	ToUpperProcessor toUpperProcessor = new ToUpperProcessor();

	String returnedString = toUpperProcessor.execute("word");

	assertThat(returnedString).isEqualTo("WORD");
    }
}