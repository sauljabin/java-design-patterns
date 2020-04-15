package pattern.behavioral.observer;

/**
 * Implementación de observer
 */
public class ShowMessageListener implements EventListener {

    @Override
    public void actionPerformed(Component component) {
        System.out.println("All right!");
    }
}
