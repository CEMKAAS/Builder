public class Person {
    protected final String name;
    protected final String surname;
    protected int age = -1;
    protected String address;


    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = -1;
    }

    public Person(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }


    public boolean hasAge() {
        if (age == -1) {
            return false;
        } else {
            return true;
        }

    }

    public int getAge() {
        if (hasAge()) {
            return age;
        } else {
            return 0;
        }
    }

    public boolean hasAddress() {
        if (address == null) {
            return false;
        } else {
            return true;
        }
    }


    public String getSurname() {
        return surname;
    }

    public void setAddress(String address) {
            this.address = address;
    }

    public void happyBirthday() {
       if (hasAge()){
           age++;
       }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public PersonBuilder newChildBuilder() {
        return new PersonBuilder()
                .setSurname(getSurname())
                .setAge(10)
                .setAddress(address);
    }
}
