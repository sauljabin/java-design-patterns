# Command

Este patrón convierte una solicitud/acción en un objeto independiente 
que contiene toda la información sobre esta. 
Esta transformación le permite parametrizar métodos con diferentes solicitudes, 
poner en cola la ejecución de una solicitud 
y respaldar operaciones que no se pueden deshacer.
Este patrón se puede completar con el patrón memento para almacenar el histórico de 
estados.

También es muy útil para encapsular la lógica de una operación y reducir 
la dependencia con los objetos que las ejecutan (receptores).

![command](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/command.png)

Ejemplo de uso:

```java 
IDE ide= new IDE();

ide.getEditor().setText("Hola mundo!");
ide.getEditor().setSelectedText("mundo");

ide.clickOnCopyButton(); // Invoca el comando desde un evento de ratón
ide.shortcutPasteButton(); // Invoca el comando desde un evento de teclado
System.out.println(ide.getEditor().getText());

ide.clickOnUndo();
System.out.println(ide.getEditor().getText()); // Muestra el texto original
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/behavioral/command)