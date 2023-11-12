# Bridge

Bridge es un patrón de diseño estructural que permite dividir una clase grande (o conjunto de clases) en dos jerarquías separadas 
(abstracción e implementación) que pueden desarrollarse independientemente una de la otra.

Se usa cuando un conjunto de clases que heredan del mismo padre crece en gran número
debido a que cada nuevo hijo debe combinar diferentes comportamientos (varias versiones del mismo).
Un ejemplo común son las formas y colores, si tenemos dos formas (cuadrado y circulo) y dos colores
(azul y rojo) entonces las combinaciones posibles son 4, a medida que vamos introduciendo formas o colores
las combinaciones crecerán mucho más. Por tanto, se separa parte de la lógica en otro conjunto de clases.

![bridge](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/bridge.png)

Ejemplo de uso:

```java
InfoLogger infoLogger = new InfoLogger(new TerminalLoggerOutput());
infoLogger.log("message"); // Salida: INFO: message

ErrorLogger errorLogger = new ErrorLogger(new FileLoggerOutput("error.log"));
errorLogger.log("message"); // Salida: File: error.log ERROR: message
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/structural/bridge)