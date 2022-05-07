# Proxy

El proxy es un patrón de diseño estructural que permite 
proporcionar un sustituto para otro objeto. 
Un proxy controla el acceso al objeto original, 
lo que le permite realizar algo antes o después de que 
la solicitud llegue al objeto original.

Algunas diferencias con el patrón [decorator](./decorator.md) son:

- El decorator obtiene la referencia del objeto decorado (generalmente a través del constructor), mientras que proxy es responsable de hacerlo solo.
- Los proxy generalmente son utilizados por los frameworks para agregar seguridad o almacenamiento en caché.
- El decorator usualmente se usa para agregar un nuevo comportamiento a las clases antiguas o heredadas.

![proxy](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/proxy.png)

Ejemplo de uso:

```java
Internet internet = new ProxyInternet();
try {
    internet.connectTo("google.com");
    internet.connectTo("forbidden.com");
} catch (Exception e) {
    System.out.println(e.getMessage());
}
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/structural/proxy)