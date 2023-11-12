package pattern.creational.abstractfactory;

public class WindowsPanel implements Panel {
    @Override
    public void paint() {
        System.out.println("Windows Panel");
    }
}
