package pattern.behavioral.mediator;

public class SpellChecker {
    private Mediator mediator;

    public SpellChecker(Mediator mediator) {
        this.mediator = mediator;
        mediator.register(this);
    }

    public void check(String newText) {
        if (newText.equals("Hola Mund!")) {
            System.out.println("SpellChecker: Error en texto");
            mediator.notifySpellingError();
        } else if (newText.equals("Hola Mundo!")) {
            System.out.println("SpellChecker: Texto correcto");
            mediator.notifySpellingSuccess();
        }
    }
}
