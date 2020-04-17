package pattern.behavioral.state;

public class Connected extends ConnectionState {
    @Override
    public void connect(Server server) {
        throw new IllegalStateException("La conexión ya fue establecida");
    }

    @Override
    public void start(Server server) {
        throw new IllegalStateException("El servicio ya fue iniciado");
    }

    @Override
    public void stop(Server server) {
        throw new IllegalStateException("Actualmente hay una conexión en curso");
    }

    @Override
    public void disconnect(Server server) {
        server.disconnectFromClient();
        server.setState(new Listening());
    }
}
