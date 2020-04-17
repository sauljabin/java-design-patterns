package pattern.behavioral.state;

public class Closed extends ConnectionState {

    @Override
    public void connect(Server server) {
        throw new IllegalStateException("La conexión se encuentra cerrada");
    }

    @Override
    public void start(Server server) {
        server.initServer();
        server.setState(new Listening());
    }

    @Override
    public void stop(Server server) {
        throw new IllegalStateException("La conexión se encuentra cerrada");
    }

    @Override
    public void disconnect(Server server) {
        throw new IllegalStateException("La conexión se encuentra cerrada");
    }
}
