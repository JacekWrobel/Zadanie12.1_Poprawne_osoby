import java.util.Scanner;

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

    public Person() {
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


    Person askData() {
        Scanner sc = new Scanner(System.in);
        Person person = null;

        String firstName = null;
        System.out.println("Podaj swoje imię");
        firstName = sc.nextLine();
        if (firstName == null || firstName.length() < 2) throw new NameUndefinedException();

        String lastName = null;
        System.out.println("Podaj swoje nazwisko");
        lastName = sc.nextLine();
        if (firstName == null || firstName.length() < 2) throw new NameUndefinedException();

        System.out.println("Podaj swoj pesel");
        String pesel = sc.nextLine();

        int age = 0;
        System.out.println("Podaj swoj wiek");
        age = sc.nextInt();
        if (age <= 1) throw new IncorrectAgeException();

        return new Person(firstName, lastName, pesel, age);
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

