package pattern.creational.abstractfactory;

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
