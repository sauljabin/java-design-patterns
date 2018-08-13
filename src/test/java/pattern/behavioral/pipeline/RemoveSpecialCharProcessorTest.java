package pattern.behavioral.pipeline;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RemoveSpecialCharProcessorTest {
    @Test
    public void shouldRemoveSpecialChars() {
        RemoveSpecialCharProcessor removeSpecialCharProcessor = new RemoveSpecialCharProcessor();

        String returnedString = removeSpecialCharProcessor.execute(".pro$gr!a?ming");

        assertThat(returnedString, is("programing"));
    }
}