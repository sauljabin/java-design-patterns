package pattern.behavioral.observer;

import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class EventManagerTest {

    @Test
    public void invokeListener() {
        Component component = mock(Component.class);
        EventListener listener = mock(EventListener.class);

        EventManager eventManager = new EventManager();
        eventManager.subscribe(listener);
        eventManager.notify(component);

        verify(listener).actionPerformed(component);
    }
}
