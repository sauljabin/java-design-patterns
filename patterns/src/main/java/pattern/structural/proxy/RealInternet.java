package pattern.structural.proxy;

/**
 * Servicio o clase real. Contiene la lógica de negocio.
 */
public class RealInternet implements Internet {

    @Override
    public void connectTo(String serverhost) {
        System.out.println("Connecting to " + serverhost);
    }
}
