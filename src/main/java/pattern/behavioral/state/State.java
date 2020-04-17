package pattern.behavioral.state;

public class State {
    public static void main(String[] args) {
        Server server = new Server();
        server.start();
        server.connect();
        server.disconnect();
        server.stop();
    }
}
