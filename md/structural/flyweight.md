# Flyweight

Flyweight es un patrón que permite optimizar el uso
de la RAM al compartir partes comunes de estado entre 
múltiples objetos en lugar de mantener todos los datos en cada objeto.

Sólo se separa la parte del objeto que pueden ser compartida entre otros objetos.

![flyweight](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/flyweight.png)

Ejemplo de uso:

```java
TreeType type = TreeTypeFactory.getTreeType("Autumn Oak", Color.YELLOW);
Tree tree1 = new Tree(10, 10, type);
Tree tree2 = new Tree(20, 20, type);

tree1.draw();
tree2.draw();
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/structural/flyweight)