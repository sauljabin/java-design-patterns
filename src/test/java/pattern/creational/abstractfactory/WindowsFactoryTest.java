package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WindowsFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
        WindowsFactory windowsFactory = new WindowsFactory();

        assertThat(windowsFactory.createButton()).isInstanceOf(WindowsButton.class);
        assertThat(windowsFactory.createPanel()).isInstanceOf(WindowsPanel.class);
    }
}