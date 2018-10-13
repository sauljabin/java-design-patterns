package pattern.creational.singleton;

public class SingletonExample {
    public static void main(String[] args) {
	Settings settings = Settings.getInstance();

	settings.set("db.name", "test");

	System.out.println(Settings.getInstance().get("db.name")); // Se llama al método getInstance de nuevo. Salida:
								   // test
    }
}
