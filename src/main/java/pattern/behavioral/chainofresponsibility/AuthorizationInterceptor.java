package pattern.behavioral.chainofresponsibility;

public class AuthorizationInterceptor extends AbstractInterceptor {

    @Override
    public void handleRequest(Request request) {
        String url = request.getUrl();
        if (url.endsWith("/forbidden")) {
            throw new RuntimeException("Access Forbidden");
        }

        System.out.println("Request authorized");
    }
}
