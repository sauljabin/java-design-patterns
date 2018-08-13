package pattern.behavioral.pipeline;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ToUpperProcessorTest {
    @Test
    public void shouldConvertStringToUpper() {
        ToUpperProcessor toUpperProcessor = new ToUpperProcessor();

        String returnedString = toUpperProcessor.execute("word");

        assertThat(returnedString, is("WORD"));
    }
}