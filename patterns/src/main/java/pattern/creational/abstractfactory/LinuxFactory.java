package pattern.creational.abstractfactory;

/**
 * Factory para crear la familia de objetos para Linux
 */
public class LinuxFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Panel createPanel() {
        return new LinuxPanel();
    }
}
