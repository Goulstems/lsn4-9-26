public class Person {
    int ID;
    String name;

    public Person(int ID, String name) {
        this.ID = ID;
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return ID == person.ID && name.equals(person.name);
    }

    @Override
    public int hashCode() {
        return ID * 31 + name.hashCode();
    }
}
