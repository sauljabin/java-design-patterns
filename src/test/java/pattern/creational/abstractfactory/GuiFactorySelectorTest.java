package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class GuiFactorySelectorTest {
    @Test
    public void shouldCreateCorrectFactory() {
        assertThat(GuiFactorySelector.getFactory(OS.LINUX), instanceOf(LinuxFactory.class));
        assertThat(GuiFactorySelector.getFactory(OS.WINDOWS), instanceOf(WindowsFactory.class));
    }
}