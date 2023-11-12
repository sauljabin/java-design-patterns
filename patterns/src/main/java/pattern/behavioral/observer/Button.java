package pattern.behavioral.observer;

/**
 * Clase cliente para ejemplificar el uso del patrón.
 */
public class Button implements Component {
    private final EventManager eventManager = new EventManager();

    public void click() {
        eventManager.notify(this);
    }

    public void addListener(EventListener saveFile) {
        eventManager.subscribe(saveFile);
    }
}
