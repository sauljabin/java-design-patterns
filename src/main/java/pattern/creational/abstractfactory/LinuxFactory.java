package pattern.creational.abstractfactory;

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
