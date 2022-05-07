# Iterator

Iterator es un patrón de diseño de comportamiento que 
permite acceder a los elementos de una colección sin 
exponer su representación subyacente (lista, pila, árbol, etc.),
o la lógica de búsqueda.

Es extensamente usado en java y en bibliotecas como JDBC. 

![iterator](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/iterator.png)

Ejemplo de uso:

```java
Twitter twitter = new Twitter();
PostsIterator postsIterator = twitter.findPostsByHashtag("#java");

while (postsIterator.hasNext()){
    Post post = postsIterator.getNext();
    System.out.println(post.getContent());
}
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/iterator)