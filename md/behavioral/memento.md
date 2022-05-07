# Memento

Patrón de diseño de comportamiento que permite capturar el estado interno de un objeto sin exponer su estructura interna, para que el objeto pueda regresar a este estado más adelante.

Es útil cuando necesitas hacer instantáneas de algunos objetos para restaurar su estado más tarde.
Permite producir copias completas del estado de un objeto y almacenarlas por separado del objeto. 

![memento](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/memento.png)

Ejemplo de uso:

```java
History history = new History();
	
Console console = new Console();
	
console.setCommand("ls -la");
history.addSnapshot(console.generateSnapshot());
	
console.setCommand("cd ..");
history.addSnapshot(console.generateSnapshot());
	
console.restoreFromSnapshot(history.getSnapshot(0));
	
console.exec(); // Salida: Exec command: ls -la
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/memento)