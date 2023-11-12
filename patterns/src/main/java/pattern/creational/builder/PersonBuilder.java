package pattern.creational.builder;

/**
 * Patrón builder. Hace al código más legible, y evita usar constructures, que
 * puedan afectar a muchas clases cuando se le agregue un nuevo parametro.
 */
public class PersonBuilder {
    private String firstName;
    private String lastName;

    public PersonBuilder firstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder lastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName);
    }
}
