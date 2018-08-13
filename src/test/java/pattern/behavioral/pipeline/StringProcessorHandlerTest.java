package pattern.behavioral.pipeline;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.*;

@RunWith(MockitoJUnitRunner.class)
public class StringProcessorHandlerTest {

    @InjectMocks
    private StringProcessorHandler stringProcessorHandler;

    @Mock
    private List<StringProcessor> stringProcessors;

    @Test
    public void shouldAddProcessorToList() {
        StringProcessor expectedProcessor = mock(StringProcessor.class);

        stringProcessorHandler.add(expectedProcessor);

        verify(stringProcessors).add(expectedProcessor);
    }

    @Test
    public void shouldReturnItselfWhenAddNewProcessor() {
        StringProcessorHandler handler = stringProcessorHandler.add(mock(StringProcessor.class));

        assertThat(handler, is(stringProcessorHandler));
    }

    @Test
    public void shouldInvokeEachProcessorExecuteFunction() {
        StringProcessor firstProcessor = mock(StringProcessor.class);
        String firstOutput = "first";
        doReturn(firstOutput).when(firstProcessor).execute(any());

        StringProcessor secondProcessor = mock(StringProcessor.class);
        String secondOutput = "second";
        doReturn(secondOutput).when(secondProcessor).execute(any());

        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        String originalInput = "original";
        String processedString = stringProcessorHandler
                .add(firstProcessor)
                .add(secondProcessor)
                .execute(originalInput);

        InOrder inOrder = inOrder(firstProcessor, secondProcessor);
        inOrder.verify(firstProcessor).execute(originalInput);
        inOrder.verify(secondProcessor).execute(firstOutput);

        assertThat(processedString, is(secondOutput));
    }

    /**
     * Este es un ejemplo de como se utilizaría el patrón.
     */
    @Ignore
    @Test
    public void examplePipeline() {
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();

        String processedString = stringProcessorHandler
                .add(new RemoveSpecialCharProcessor())
                .add(new ToUpperProcessor())
                .execute("This$ is an uncl@ean+ed fra#SE");

        System.out.println(processedString);
    }
}