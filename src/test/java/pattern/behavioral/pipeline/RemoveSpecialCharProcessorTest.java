package pattern.behavioral.pipeline;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RemoveSpecialCharProcessorTest {
    @Test
    public void shouldRemoveSpecialChars() {
        RemoveSpecialCharProcessor removeSpecialCharProcessor = new RemoveSpecialCharProcessor();

        String returnedString = removeSpecialCharProcessor.execute(".pro$gr!a?ming");

        assertThat(returnedString)
                .isEqualTo("programing");
    }
}