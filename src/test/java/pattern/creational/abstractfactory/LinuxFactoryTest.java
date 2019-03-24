package pattern.creational.abstractfactory;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class LinuxFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
        LinuxFactory linuxFactory = new LinuxFactory();

        assertThat(linuxFactory.createButton())
                .isInstanceOf(LinuxButton.class);

        assertThat(linuxFactory.createPanel())
                .isInstanceOf(LinuxPanel.class);
    }
}