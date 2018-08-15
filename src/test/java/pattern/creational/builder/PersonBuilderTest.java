package pattern.creational.builder;

import com.github.javafaker.Faker;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class PersonBuilderTest {
    private Faker faker = new Faker();

    @Test
    public void shouldReturnAPersonWithCorrectFirstName() {
        PersonBuilder personBuilder = new PersonBuilder();

        String firstName = faker.name().firstName();
        Person person = personBuilder
                .firstName(firstName)
                .build();

        assertThat(person.getFirstName(), is(firstName));
    }

    @Test
    public void shouldReturnAPersonWithCorrectLastName() {
        PersonBuilder personBuilder = new PersonBuilder();

        String lastName = faker.name().lastName();
        Person person = personBuilder
                .lastName(lastName)
                .build();

        assertThat(person.getLastName(), is(lastName));
    }
}