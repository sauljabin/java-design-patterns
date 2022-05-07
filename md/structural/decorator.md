# Decorator

Decorator es un patrón que permite agregar nuevos comportamientos 
a los objetos al colocarlos dentro de otros objetos envoltorios (wrappers) especiales.

El patrón [adapter](#adapter) cambia la interfaz de un objeto existente, 
mientras que el decorator mejora un objeto sin cambiar su interfaz. 
Además, admite la composición recursiva, 
que no es posible cuando se usa el adapter.

![decorator](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/decorator.png)

Ejemplo de uso:

```java
ConsoleDataSource consoleDataSource = new ConsoleDataSource();
String data = consoleDataSource.readData();
consoleDataSource.writeData(data);

EncryptionDecorator encryptionDecorator = new EncryptionDecorator(consoleDataSource);
encryptionDecorator.writeData(data);
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/structural/decorator)