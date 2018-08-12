package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class WindowsFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
        WindowsFactory windowsFactory = new WindowsFactory();

        assertThat(windowsFactory.createButton(), instanceOf(WindowsButton.class));
        assertThat(windowsFactory.createPanel(), instanceOf(WindowsPanel.class));
    }
}