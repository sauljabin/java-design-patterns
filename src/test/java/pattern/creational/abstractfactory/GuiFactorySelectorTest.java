package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class GuiFactorySelectorTest {
    @Test
    public void shouldCreateCorrectFactory() {
        assertThat(GuiFactorySelector.getFactory(OS.LINUX))
                .isInstanceOf(LinuxFactory.class);

        assertThat(GuiFactorySelector.getFactory(OS.WINDOWS))
                .isInstanceOf(WindowsFactory.class);
    }
}