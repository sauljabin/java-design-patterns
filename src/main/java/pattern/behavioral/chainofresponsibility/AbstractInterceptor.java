package pattern.behavioral.chainofresponsibility;

public abstract class AbstractInterceptor implements Interceptor {
    private Interceptor next;

    public void intercept(Request request) {
        handleRequest(request);
        if (getNext() != null) {
            getNext().intercept(request);
        }
    }

    public Interceptor getNext() {
        return next;
    }

    public void setNext(Interceptor interceptor) {
        next = interceptor;
    }
}
