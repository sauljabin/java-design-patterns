package pattern.creational.abstractfactory;

public class LinuxPanel implements Panel {
    @Override
    public void paint() {
        System.out.println("Panel en Linux");
    }
}
