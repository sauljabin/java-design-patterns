package pattern.structural.bridge;

import com.github.javafaker.Faker;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class WarnLoggerTest {

    @Test
    public void shouldInvokeConcreteImplementor() {
        LoggerOutput loggerOutput = mock(LoggerOutput.class);
        String message = Faker.instance().regexify("[a-z]{10}");
        Logger warnLogger = new WarnLogger(loggerOutput);

        warnLogger.log(message);

        verify(loggerOutput).output("WARN: " + message);
    }
}