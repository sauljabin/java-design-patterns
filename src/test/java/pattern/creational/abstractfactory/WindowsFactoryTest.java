package pattern.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class WindowsFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
	WindowsFactory windowsFactory = new WindowsFactory();

	assertThat(windowsFactory.createButton()).isInstanceOf(WindowsButton.class);
	assertThat(windowsFactory.createPanel()).isInstanceOf(WindowsPanel.class);
    }
}