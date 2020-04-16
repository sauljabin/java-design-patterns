package pattern.behavioral.visitor;

import java.util.stream.Collectors;

/**
 * Esta clase puede visitar diferentes elementos (visitable).
 * Además puede contener comportamientos extras.
 */
public class JsonExporter implements Visitor {

    private String json;

    @Override
    public void visit(Header header) {
        json = "\"header\": { }";
    }

    @Override
    public void visit(Body body) {
        json = "\"body\": { }";
    }

    public String export(Document document) {
        return "{" + document.getElements()
                .stream()
                .map(element -> {
                            element.accept(this);
                            return json;
                        }
                ).collect(Collectors.joining(",")) + "}";
    }
}
