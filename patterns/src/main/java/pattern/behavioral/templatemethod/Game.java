package pattern.behavioral.templatemethod;

import java.util.Arrays;
import java.util.List;

public class Game {
    private static final int FPS = 30;
    private List<Animatable> animatableObjects = Arrays.asList(new Rocket());

    /**
     * Para este ejemplo simularemos que se trata de 30 frames por segundo.
     */
    public void start() {
        for (int i = 0; i < FPS; i++) {
            for (Animatable animatable : animatableObjects) {
                // Se invoca al template method.
                animatable.updateFrame();
            }
        }
    }
}
