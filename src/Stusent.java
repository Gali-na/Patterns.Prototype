public class Stusent implements  Copyable{
    private int age;
    private String name;
    private String surname;

    public Stusent() {
    }

    public Stusent(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    @Override
    public Object createPrototype() {
        Stusent stusent = new Stusent(this.age,this.name,this.surname);
        return stusent;
    }

    @Override
    public String toString() {
        return "Stusent{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
