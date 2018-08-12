package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.hamcrest.core.IsInstanceOf.instanceOf;
import static org.junit.Assert.assertThat;

public class LinuxFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
        LinuxFactory linuxFactory = new LinuxFactory();

        assertThat(linuxFactory.createButton(), instanceOf(LinuxButton.class));
        assertThat(linuxFactory.createPanel(), instanceOf(LinuxPanel.class));
    }
}