# Observer

Observer es un patrón de diseño de comportamiento que permite definir
un mecanismo de suscripción para notificar a varios objetos
sobre cualquier evento que ocurra al objeto que están observando.

Es un patrón muy utilizado en las interfaces gráficas.

En el ejemplo cuando se hace clic en un botón se notifica a los observadores
'guardar archivo' y 'mostrar mensaje'. 

![observer](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/observer.png)

Ejemplo de uso:

```java
Button button = new Button();
button.addListener(new SaveFileListener());
button.addListener(new ShowMessageListener());
button.click(); // Se notificará a los observers
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/behavioral/observer)