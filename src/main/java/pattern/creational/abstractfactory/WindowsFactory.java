package pattern.creational.abstractfactory;

/**
 * Factory para crear la familia de objetos para Windows
 */
public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Panel createPanel() {
        return new WindowsPanel();
    }
}
