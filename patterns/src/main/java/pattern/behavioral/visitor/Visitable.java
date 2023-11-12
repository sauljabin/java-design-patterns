package pattern.behavioral.visitor;

/**
 * Objeto a visitar, se agregan capacidades en otra clase.
 */
public interface Visitable {

    /**
     * Método accept
     */
    void accept(Visitor visitor);
}
