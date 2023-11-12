package pattern.creational.abstractfactory;

public class AbstractFactoryExample {
    public static void main(String[] args) {
        GuiFactory guiFactory = GuiFactorySelector.getFactory(OS.LINUX);

        Button button = guiFactory.createButton(); // Botón que funcionará solo en linux
        button.paint(); // Salida: Linux Button

        Panel panel = guiFactory.createPanel(); // Panel que funcionará solo en linux
        panel.paint(); // Salida: Linux Panel
    }
}
