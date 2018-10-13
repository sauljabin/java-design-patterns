package pattern.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class GuiFactorySelectorTest {
    @Test
    public void shouldCreateCorrectFactory() {
	assertThat(GuiFactorySelector.getFactory(OS.LINUX)).isInstanceOf(LinuxFactory.class);
	assertThat(GuiFactorySelector.getFactory(OS.WINDOWS)).isInstanceOf(WindowsFactory.class);
    }
}