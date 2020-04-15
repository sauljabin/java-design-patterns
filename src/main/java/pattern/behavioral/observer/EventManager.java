package pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Publicador (observable).
 */
public class EventManager {
    private final List<EventListener> listeners = new ArrayList<>();

    public void subscribe(EventListener listener) {
        listeners.add(listener);
    }

    public void unsubscribe(EventListener listener) {
        listeners.remove(listener);
    }

    public void notify(Component component) {
        for (EventListener listener : listeners) {
            listener.actionPerformed(component);
        }
    }
}
