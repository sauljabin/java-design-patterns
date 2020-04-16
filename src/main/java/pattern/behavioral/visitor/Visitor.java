package pattern.behavioral.visitor;

/**
 * Esta interfaz contiene los métodos visitantes
 */
public interface Visitor {
    void visit(Header header);

    void visit(Body body);
}
