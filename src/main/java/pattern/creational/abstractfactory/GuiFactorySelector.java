package pattern.creational.abstractfactory;

/**
 * Esta clase se encarga de crear el factory solicitado.
 */
public class GuiFactorySelector {
    public static GuiFactory getFactory(OS os) {
        switch (os) {
            case LINUX:
                return new LinuxFactory();
            case WINDOWS:
                return new WindowsFactory();
            default:
                return null;
        }
    }
}
