package pattern.behavioral.state;

/**
 * Clase (o interfaz) estado con las posibles acciones.
 * Los estados en concreto heredan de esta.
 * Cada estado concreto puede interferir en la clase contexto cambiándola de estado.
 */
public abstract class ConnectionState {
    public abstract void connect(Server server);
    public abstract void start(Server server);
    public abstract void stop(Server server);
    public abstract void disconnect(Server server);
}
