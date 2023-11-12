package pattern.behavioral.state;

public class Listening extends ConnectionState {
    @Override
    public void connect(Server server) {
        server.establishingNewConnection();
        server.setState(new Connected());
    }

    @Override
    public void start(Server server) {
        throw new IllegalStateException("El servicio ya fue iniciado");
    }

    @Override
    public void stop(Server server) {
        server.destroyService();
        server.setState(new Closed());
    }

    @Override
    public void disconnect(Server server) {
        throw new IllegalStateException("No se encuentra conectado");
    }
}
