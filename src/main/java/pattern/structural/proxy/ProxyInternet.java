package pattern.structural.proxy;

import java.util.ArrayList;
import java.util.List;

/**
 * Clase proxy, utiliza la misma interfaz que la real.
 * Enmascara la lógica de negocio de otra clase.
 */
public class ProxyInternet implements Internet {

    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("forbidden.com");
    }

    private Internet internet = new RealInternet();

    @Override
    public void connectTo(String serverhost) throws Exception {
        if (bannedSites.contains(serverhost.toLowerCase())) {
            throw new Exception("Access Denied");
        }

        internet.connectTo(serverhost);
    }
}
