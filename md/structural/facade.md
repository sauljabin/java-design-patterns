# Facade

Facade es un patrón de diseño estructural que proporciona una interfaz 
simplificada para una biblioteca, un framework o cualquier otro 
conjunto complejo de clases (subsistema). 

Permite separar y reemplazar de manera sencilla diferentes subsistemas. 
Disminuye el acoplamiento y dependencia de un conjunto de clases hacia otro.

En el ejemplo el cliente no necesita saber nada sobre la implementación del subsistema,
excepto la inicialización de la clase controladora para la base de datos requerida.
El cliente simplemente interactúa con las interfaces de la fachada en lugar de clases
específicas de la base de datos.
DriverManager actúa como una fachada para el subsistema subyacente.

Entre los ejemplos más conocidos tenemos JDBC y SLF4J.

![facade](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/structural/facade.png)

Ejemplo de uso:

```java
Class.forName("pattern.structural.facade.oracle.OracleJDBCDriver");
Connection connection = DriverManager.getConnection("oracle");
Statement statement = connection.createStatement();
statement.executeQuery("select * from employee");

Class.forName("pattern.structural.facade.mysql.MySQLJDBCDriver");
connection = DriverManager.getConnection("mysql");
statement = connection.createStatement();
statement.executeQuery("select * from employee");
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/structural/facade)