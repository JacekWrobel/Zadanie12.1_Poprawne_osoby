import java.util.Scanner;

public class TestPerson {

    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner sc = new Scanner(System.in);

        String firstName = null;
        System.out.println("Podaj swoje imię");
        try {
            firstName = sc.nextLine();
            if (firstName == null | firstName.length() < 2) throw new NameUndefinedException();
        } catch (NameUndefinedException e) {
            System.out.println("Imię nie zostało podane lub jest krótsze niż 2 litery");
        }

        String lastName = null;
        System.out.println("Podaj swoje nazwisko");
        try {
            lastName = sc.nextLine();
            if (lastName == null) throw new NameUndefinedException();
            if (lastName.length() < 2) throw new NameUndefinedException();
        } catch (NameUndefinedException e) {
            System.out.println("Nazwisko Imię nie zostało podane lub jest krótsze niż 2 litery");
        }
        System.out.println("Podaj swoj pesel");
        String pesel = sc.nextLine();

        int age = 0;
        System.out.println("Podaj swoj wiek");
        try {
            age = sc.nextInt();
            if (age <= 1) throw new IncorrectAgeException();
        } catch (IncorrectAgeException e) {
            System.out.println("Wiek za niski");
        }

        Person person2 = new Person(firstName, lastName, pesel, age);
        System.out.println(person2);


    }


}