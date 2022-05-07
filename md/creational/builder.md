# Builder

Permite producir diferentes tipos y representaciones de un objeto utilizando el mismo proceso de construcción. 
El builder permite construir objetos complejos paso a paso.
Ayuda a que el código sea más legible. Y evita usar constructores, los 
cuales afectan a muchas clases cuando se cambia su firma.
También encapsula lógica especifica de construcción del objeto,
abstrayendo al usuario de este conocimiento. Código [Builder](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/creational/builder).

![builder](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/creational/builder.png)

Ejemplo de uso:

```java
Person person = Person.builder()
                .firstName("Nikola")
                .lastName("Tesla")
                .build();

System.out.println(person);
```