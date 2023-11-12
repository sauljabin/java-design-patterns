# Visitor

Este patrón permite separar nuevos algoritmos o capacidades de los objetos en los que operan.

Es utilizado cuando es necesario agregar nuevas capacidades a objetos ya existentes,
sin agregar más complejidad a estos (o más líneas de código), sino moviendo dicha complejidad a otras clases.
También es utilizado cuando las nuevas operaciones a agregar no corresponden al dominio
a la clase original, ya que agregaría responsabilidades que no debería tener (principio de responsabilidad única).

Puede existir diferentes visitantes, uno para cada nueva capacidad que se desee agregar.

En el ejemplo es necesario agregar más lógica para exportar cada elemento,
su utiliza visitadores con la capacidad de exportar en diferentes formatos. 

![visitor](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/visitor.png)

Ejemplo de uso:

```java
Document document = new Document();
document.addElement(new Header());
document.addElement(new Body());

JsonExporter jsonExporter = new JsonExporter();
System.out.println(jsonExporter.export(document));

XmlExporter xmlExporter = new XmlExporter();
System.out.println(xmlExporter.export(document));
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/behavioral/visitor)
