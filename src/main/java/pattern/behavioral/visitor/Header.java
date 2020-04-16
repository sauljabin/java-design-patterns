package pattern.behavioral.visitor;

public class Header implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
