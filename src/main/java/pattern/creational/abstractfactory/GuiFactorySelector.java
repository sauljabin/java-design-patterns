package pattern.creational.abstractfactory;

/**
 * Esta clase se encarga de crear el factory solicitado.
 */
public class GuiFactorySelector {
    public static GuiFactory getFactory(OS os) {
        if (os.equals(OS.LINUX)) {
            return new LinuxFactory();
        } else if (os.equals(OS.WINDOWS)) {
            return new WindowsFactory();
        }
        return null;
    }
}
