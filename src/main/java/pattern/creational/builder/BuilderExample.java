package pattern.creational.builder;

public class BuilderExample {
    public static void main(String[] args) {
        Person person = Person.builder()
                .firstName("Nikola")
                .lastName("Tesla")
                .build();

        System.out.println(person);
    }
}
