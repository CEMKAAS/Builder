import java.util.OptionalInt;

public class PersonBuilder {
    public String name;
    public String surname;
    public int age = -1;
    public String address;


    public PersonBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        this.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Возраст не может быть отрицательным");
        }
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        if (name == null || surname == null) {
            throw new IllegalStateException("Небходимы имя и фамилия");
        }
        Person person = age == -1 ? new Person(name, surname) : new Person(name, surname, age);

        if (address != null) {
            person.setAddress(address);
        }
        return person;
    }
}
