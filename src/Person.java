public class Person {
    private String firstName;
    private String lastName;
    private String pesel;
    private int age;

    public Person(String firstName, String lastName, String pesel, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.pesel = pesel;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " " + pesel + " " + age + " ";
    }
/*
    void createNewPerson() {
        if (age <= 1) throw new IncorrectAgeException();
        if (firstName == null) throw new IncorrectAgeException();
        if (lastName == null) throw new IncorrectAgeException();
        if (firstName.length() < 2) throw new IncorrectAgeException();
        if (lastName.length() < 2) throw new IncorrectAgeException();
//else Person person = new Person(String firstName, String lastName, String pesel, int age);

    }
 */
}
