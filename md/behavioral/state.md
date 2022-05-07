# State

Este patrón permite separar es útil cuando se tiene un problema de máquina de estado finito,
y queremos separar la lógica de control de los estados (flujos de acciones) de 
las responsabilidades inherentes a la clase.
Permite que un objeto altere su comportamiento cuando cambia su estado interno. 

Este patrón evita el código espagueti, separando la lógica de los estados a clases externas,
además de evitar el uso de if anidados o switch.

En el ejemplo una clase servidor cambia a diferentes estados según acciones (o eventos),
estas invocan al estado actual para que dirija el flujo hacia otras acciones y estados.
Por ejemplo: el servidor inicia con estado 'cerrado', al invocar la acción iniciar cambia al estado 'escuchando'.

![state](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/state.png)

Ejemplo de uso:

```java
Server server = new Server();
server.start();
server.connect();
server.disconnect();
server.stop();
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/state)