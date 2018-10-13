package pattern.creational.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 * Clase Singleton, es final debido a que no de debe heredar. Utiliza métodos
 * sincronizado para trabajar con hilos. El constructor se declara como privado
 * para que solo pueda ser instanciada internamente.
 */
public final class Settings {
    private static Settings instance;
    private final Map<String, String> settingsMap;

    private Settings() {
	settingsMap = new HashMap<>();
    }

    public synchronized static Settings getInstance() {
	if (instance == null) {
	    instance = new Settings();
	}
	return instance;
    }

    public synchronized void set(String key, String value) {
	settingsMap.put(key, value);
    }

    public synchronized void remove(String key) {
	settingsMap.remove(key);
    }

    public synchronized String get(String key) {
	return settingsMap.get(key);
    }
}
