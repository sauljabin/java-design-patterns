package pattern.behavioral.pipeline;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class ToUpperProcessorTest {
    @Test
    public void shouldConvertStringToUpper() {
        ToUpperProcessor toUpperProcessor = new ToUpperProcessor();

        String returnedString = toUpperProcessor.execute("word");

        assertThat(returnedString).isEqualTo("WORD");
    }
}