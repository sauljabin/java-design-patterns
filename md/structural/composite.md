# Composite

Es un patrón de diseño estructural que le permite componer objetos en estructuras de árbol. 
Se usa en estructuras que necesitan composición anidada o recursiva. Un ejemplo puede ser la creación de interfaces
gráficas. 

![composite](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/composite.png)

Ejemplo de uso:

```java
Window window = new Window("Main Window");

Panel firstPanel = new Panel("First Panel");
firstPanel.add(new Label("Label in First Panel"));
window.add(firstPanel);

Panel secondPanel = new Panel("Second Panel");
secondPanel.add(new Label("Label in Second Panel"));
window.add(secondPanel);

window.draw();
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/structural/composite)