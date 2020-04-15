package pattern.behavioral.chainofresponsibility;

import java.util.Map;

public class ChainOfResponsibility {

    public static void main(String[] args) {
        AuthorizationInterceptor authorizationInterceptor = new AuthorizationInterceptor();

        AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();
        authenticationInterceptor.setNext(authorizationInterceptor);

        Request request = new Request();
        request.setHeaders(Map.of("Access-Token", "123"));
        request.setUrl("http://myweb.com/forbidden");

        authenticationInterceptor.intercept(request);
    }
}
