package pattern.behavioral.observer;

/**
 * Implementación de observer.
 */
public class SaveFileListener implements EventListener {

    @Override
    public void actionPerformed(Component component) {
        System.out.println("Saving file");
    }
}
