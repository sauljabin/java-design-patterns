# Template Method

El Método de plantilla es un patrón de diseño de 
comportamiento que define el esqueleto de un algoritmo en la superclase, 
pero permite que las subclases sobrescriban los pasos específicos 
del algoritmo sin cambiar su estructura.

En el ejemplo un objeto animatable sobrescribe solamente 'animate' y 'paint'.
El objeto cliente (Game) no llama directamente los métodos plantillas (pasos específicos),
sino que invoca 'updateFrame' (el Template Method). 

![templatemethod](https://raw.githubusercontent.com/sauljabin/java-design-patterns/main/plantuml/behavioral/templatemethod.png)

Ejemplo de uso:

```java
/**
 * Un objeto 2D.
 */
public abstract class Animatable {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    /**
     * Este es el "Template Method".
     * Puede ser final para que no se herede.
     */
    public void updateFrame() {
        animate();
        paint();
    }

    public abstract void animate();

    public abstract void paint();
}
```

> [Código](https://github.com/sauljabin/java-design-patterns/tree/main/src/main/java/pattern/behavioral/templatemethod)