package pattern.behavioral.visitor;

import java.util.stream.Collectors;

/**
 * Esta clase puede visitar diferentes elementos (visitable).
 * Además puede contener comportamientos extras.
 */
public class XmlExporter implements Visitor {

    private String xml;

    @Override
    public void visit(Header header) {
        xml = "<header></header>";
    }

    @Override
    public void visit(Body body) {
        xml = "<body></body>";
    }

    /**
     * Este método invoca 'accept' de los objetos visitables.
     */
    public String export(Document document) {
        return "<document>" + document.getElements()
                .stream()
                .map(element -> {
                            element.accept(this);
                            return xml;
                        }
                ).collect(Collectors.joining()) + "</document>";
    }
}
