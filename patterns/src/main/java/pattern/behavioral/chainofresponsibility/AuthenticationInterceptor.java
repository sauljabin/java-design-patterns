package pattern.behavioral.chainofresponsibility;

import java.util.Arrays;
import java.util.List;

public class AuthenticationInterceptor extends AbstractInterceptor {

    private final List<String> validTokens = Arrays.asList("abc", "123");

    @Override
    public void handleRequest(Request request) {
        String accessToken = request.getHeaders().get("Access-Token");
        if (!validTokens.contains(accessToken)) {
            throw new RuntimeException("Invalid Access Token");
        }

        System.out.println("Request authenticated");
    }
}
