package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class Document {
    private final List<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public List<Element> getElements() {
        return elements;
    }
}
