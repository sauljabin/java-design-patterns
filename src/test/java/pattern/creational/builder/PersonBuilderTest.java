package pattern.creational.builder;

import com.github.javafaker.Faker;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PersonBuilderTest {
    private Faker faker = new Faker();

    @Test
    public void shouldReturnAPersonWithCorrectFirstName() {
        PersonBuilder personBuilder = new PersonBuilder();

        String firstName = faker.name().firstName();
        Person person = personBuilder.firstName(firstName).build();

        assertThat(person.getFirstName()).isEqualTo(firstName);
    }

    @Test
    public void shouldReturnAPersonWithCorrectLastName() {
        PersonBuilder personBuilder = new PersonBuilder();

        String lastName = faker.name().lastName();
        Person person = personBuilder.lastName(lastName).build();

        assertThat(person.getLastName()).isEqualTo(lastName);
    }
}