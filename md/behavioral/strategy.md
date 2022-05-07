# Strategy

Permite definir una familia de algoritmos, encapsular cada uno y hacerlos intercambiables. El patrón permite que el algoritmo varíe independientemente de los clientes que lo utilizan.

Es útil cuando se tienes un objeto que debería poder hacer la misma tarea de muchas maneras diferentes. 
Esas tareas se pueden descomponer en clases de una misma familia. 

![strategy](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/strategy.png)

Ejemplo de uso:

```java
Compressor compressor = new Compressor();
compressor.setCompressionFormat(new ZipCompression());
	
compressor.compress(asList(new File("README.md"))); // Salida: Compressing [README.md] with zip format
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/strategy)