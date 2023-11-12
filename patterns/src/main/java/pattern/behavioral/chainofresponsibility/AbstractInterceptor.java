package pattern.behavioral.chainofresponsibility;

/**
 * Clase base de todos los interceptores, implementa la mayoría de los métodos, excepto handleRequest.
 * El método intercept ejecuta la cadena.
 */
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
