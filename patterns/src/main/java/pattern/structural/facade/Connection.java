package pattern.structural.facade;

/**
 * Facade. Proporciona acceso a la funcionalidad particular del subsistema.
 */
public interface Connection {
    Statement createStatement();
}
