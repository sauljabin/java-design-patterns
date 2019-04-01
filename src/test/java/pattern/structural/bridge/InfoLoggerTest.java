package pattern.structural.bridge;

import com.github.javafaker.Faker;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class InfoLoggerTest {
    @Test
    public void shouldInvokeConcreteImplementor() {
        LoggerOutput loggerOutput = mock(LoggerOutput.class);
        String message = Faker.instance().regexify("[a-z]{10}");
        Logger warnLogger = new InfoLogger(loggerOutput);

        warnLogger.log(message);

        verify(loggerOutput).output("INFO: " + message);
    }
}