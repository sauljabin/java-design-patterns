package pattern.behavioral.visitor;

public class VisitorDemo {

    public static void main(String[] args) {
        Document document = new Document();
        document.addElement(new Header());
        document.addElement(new Body());

        JsonExporter jsonExporter = new JsonExporter();
        System.out.println(jsonExporter.export(document));

        XmlExporter xmlExporter = new XmlExporter();
        System.out.println(xmlExporter.export(document));
    }
}
