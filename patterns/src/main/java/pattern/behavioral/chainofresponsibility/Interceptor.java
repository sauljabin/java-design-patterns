package pattern.behavioral.chainofresponsibility;

public interface Interceptor {

    void handleRequest(Request request);

    void intercept(Request request);

    Interceptor getNext();

    void setNext(Interceptor interceptor);
}
