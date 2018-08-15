package pattern.creational.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GuiFactory guiFactory = GuiFactorySelector.getFactory(OS.LINUX);

        Button button = guiFactory.createButton();
        button.paint();

        Panel panel = guiFactory.createPanel();
        panel.paint();
    }
}
