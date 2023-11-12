package pattern.behavioral.state;

/**
 * Clase de contexto (máquina de estados) puede cambiar de estado según acciones.
 * La clase contexto contiene absolutamente todas la lógica de negocio según su responsabilidad.
 * EL patrón solo se encargará de dirigir las acciones de la clase contexto.
 */
public class Server {

    private ConnectionState state;

    public Server() {
        this.state = new Closed();
    }

    public void connect() {
        state.connect(this);
    }

    public void disconnect() {
        state.disconnect(this);
    }

    public void start() {
        state.start(this);
    }

    public void stop() {
        state.stop(this);
    }

    public ConnectionState getState() {
        return state;
    }

    public void setState(ConnectionState state) {
        this.state = state;
    }

    /**
     * Los siguientes son métodos que contienen la lógica del dominio de la clase, toda su responsabilidad.
     * Las responsabilidades no han sigo de legadas al patrón state, el patrón sólo se encarga de dirigir.
     */
    public void initServer() {
        System.out.println("Iniciando servicio");
    }

    public void destroyService() {
        System.out.println("Apagando servicio");
    }

    public void establishingNewConnection() {
        System.out.println("Conectando a un cliente");
    }

    public void disconnectFromClient() {
        System.out.println("Desconectando al actual cliente");
    }
}
