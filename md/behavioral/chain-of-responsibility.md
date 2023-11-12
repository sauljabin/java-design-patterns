# Chain Of Responsibility

Consiste en un procesamiento en cadena de un elemento, cada eslabón de la cadena se denomina controlador (handler).
Al recibir una solicitud, cada controlador decide procesar la solicitud o pasarla al siguiente controlador de la cadena.

En el ejemplo refleja de manera muy básica el funcionamiento de los interceptores en
un servidor web. Cada interceptor recibe la petición hecha, y la procesa según se responsabilidad.
Se incluyeron dos interceptores, para autorización y autenticación respectivamente. 

![chainofresponsibility](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/chainofresponsibility.png)

Ejemplo de uso:

```java
AuthorizationInterceptor authorizationInterceptor = new AuthorizationInterceptor();

AuthenticationInterceptor authenticationInterceptor = new AuthenticationInterceptor();
authenticationInterceptor.setNext(authorizationInterceptor);

Request request = new Request();
request.setHeaders(Map.of("Access-Token", "123"));
request.setUrl("http://myweb.com/forbidden");

authenticationInterceptor.intercept(request); // SALIDA: EXCEPTION
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/patterns/src/main/java/pattern/behavioral/chainofresponsibility)