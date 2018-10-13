package pattern.creational.abstractfactory;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class LinuxFactoryTest {
    @Test
    public void shouldCreateTheCorrectComponents() {
	LinuxFactory linuxFactory = new LinuxFactory();

	assertThat(linuxFactory.createButton()).isInstanceOf(LinuxButton.class);
	assertThat(linuxFactory.createPanel()).isInstanceOf(LinuxPanel.class);
    }
}