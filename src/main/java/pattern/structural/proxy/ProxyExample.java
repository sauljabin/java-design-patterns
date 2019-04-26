package pattern.structural.proxy;

public class ProxyExample {

    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try {
            internet.connectTo("google.com");
            internet.connectTo("forbidden.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
