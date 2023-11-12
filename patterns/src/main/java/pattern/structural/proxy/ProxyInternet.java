package pattern.structural.proxy;

import java.util.Arrays;
import java.util.List;

/**
 * Clase proxy, utiliza la misma interfaz que la real.
 * Enmascara la lógica de negocio de otra clase.
 */
public class ProxyInternet implements Internet {

    private final List<String> bannedSites = Arrays.asList("forbidden.com");
    private final Internet internet = new RealInternet();

    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverHost);
    }
}
