package pattern.behavioral.visitor;

public class Body implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
