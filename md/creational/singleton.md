# Singleton

Singleton es un patrón creacional que hace que exista solo una instancia para un tipo de dato.
Permite el acceso global a la instancia. Es usado cuando se necesita que compartir un recurso en todo la aplicación,
como por ejemplo la conexión a la base de datos. 

En el ejemplo se presenta un uso común, el acceso a configuraciones en la aplicación.
Generalmente las configuraciones son compartidas, y se necesita acceder a ellas desde cualquier
punto de la aplicación, además es necesario que estas se actualizen para toda la aplicación por igual. Código [Singleton](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/creational/singleton).

![singleton](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/creational/singleton.png)

Ejemplo de uso:

```java
Settings settings = Settings.getInstance();

settings.set("db.name", "test");

System.out.println(Settings.getInstance().get("db.name")); // Se llama al método getInstance de nuevo. Salida: test
```