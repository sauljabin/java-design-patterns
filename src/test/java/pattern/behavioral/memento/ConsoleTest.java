package pattern.behavioral.memento;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Before;
import org.junit.Test;

import com.github.javafaker.Faker;

public class ConsoleTest {

    private Faker faker = new Faker();
    private String randomString;

    @Before
    public void setup() {
	randomString = faker.regexify("[a-z1-9]{10}");
    }

    @Test
    public void shouldGenerateASnapshot() {
	Console console = new Console();
	console.setCommand(randomString);

	Snapshot output = console.generateSnapshot();

	assertThat(output.getCommand()).isEqualTo(randomString);
    }
    
    @Test
    public void shouldRestoreFromSnapshot() {
	Console console = new Console();
	Snapshot snapshot = new Snapshot(randomString);

	console.restoreFromSnapshot(snapshot);
	Snapshot output = console.generateSnapshot();

	assertThat(output.getCommand()).isEqualTo(randomString);
    }

}
