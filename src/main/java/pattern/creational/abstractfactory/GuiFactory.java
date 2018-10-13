package pattern.creational.abstractfactory;

/**
 * Esta es la Abstract Factory para hacer interfaces gráficas. Es una clase que
 * crea una colección de clases asociadas.
 */
public interface GuiFactory {
    Button createButton();

    Panel createPanel();
}
