package pattern.behavioral.pipeline;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class RemoveSpecialCharProcessorTest {
    @Test
    public void shouldRemoveSpecialChars() {
	RemoveSpecialCharProcessor removeSpecialCharProcessor = new RemoveSpecialCharProcessor();

	String returnedString = removeSpecialCharProcessor.execute(".pro$gr!a?ming");

	assertThat(returnedString).isEqualTo("programing");
    }
}