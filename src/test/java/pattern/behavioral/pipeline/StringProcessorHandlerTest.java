package pattern.behavioral.pipeline;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InOrder;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
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

        verify(stringProcessors)
                .add(expectedProcessor);
    }

    @Test
    public void shouldReturnItselfWhenAddNewProcessor() {
        StringProcessorHandler handler = stringProcessorHandler.add(mock(StringProcessor.class));

        assertThat(handler)
                .isEqualTo(stringProcessorHandler);
    }

    @Test
    public void shouldInvokeEachProcessorExecuteFunction() {
        String firstOutput = "";
        String secondOutput = "";
        String originalInput = "";
        StringProcessorHandler stringProcessorHandler = new StringProcessorHandler();
        StringProcessor firstProcessor = mock(StringProcessor.class);
        StringProcessor secondProcessor = mock(StringProcessor.class);

        doReturn(firstOutput).when(firstProcessor).execute(any());
        doReturn(secondOutput).when(secondProcessor).execute(any());

        String processedString = stringProcessorHandler.add(firstProcessor).add(secondProcessor).execute(originalInput);

        InOrder inOrder = inOrder(firstProcessor, secondProcessor);
        inOrder.verify(firstProcessor).execute(originalInput);
        inOrder.verify(secondProcessor).execute(firstOutput);

        assertThat(processedString)
                .isEqualTo(secondOutput);
    }
}