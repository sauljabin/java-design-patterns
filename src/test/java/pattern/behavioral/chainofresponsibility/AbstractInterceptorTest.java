package pattern.behavioral.chainofresponsibility;

import org.junit.Test;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

public class AbstractInterceptorTest {

    @Test
    public void invokeHandleMethod() {
        Request request = new Request();

        AbstractInterceptor next = spy(AbstractInterceptor.class);
        
        AbstractInterceptor interceptor = spy(AbstractInterceptor.class);
        interceptor.setNext(next);
        interceptor.intercept(request);

        verify(interceptor).handleRequest(request);
        verify(next).intercept(request);
    }
}
