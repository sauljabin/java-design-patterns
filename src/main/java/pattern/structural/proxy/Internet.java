package pattern.structural.proxy;

/**
 * Service Interface.
 * El proxy debe implementar esta interfaz para enmascarar
 * la clase real.
 */
public interface Internet {
    void connectTo(String serverhost) throws Exception;
}
