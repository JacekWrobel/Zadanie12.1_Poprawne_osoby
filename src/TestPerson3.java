import java.util.Scanner;

public class TestPerson3 {

    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner sc = new Scanner(System.in);

        try {
            String firstName = null;
            System.out.println("Podaj swoje imię");
            firstName = sc.nextLine();

            String lastName = null;
            System.out.println("Podaj swoje nazwisko");
            lastName = sc.nextLine();

            System.out.println("Podaj swoj pesel");
            String pesel = sc.nextLine();

            int age = 0;
            System.out.println("Podaj swoj wiek");
            age = sc.nextInt();


            if (firstName == null | firstName.length() < 2) throw new NameUndefinedException();
            if (lastName == null | lastName.length() < 2) throw new NameUndefinedException();
            if (age < 1) throw new IncorrectAgeException();

            Person person2 = new Person(firstName, lastName, pesel, age);
            System.out.println(person2);
        } catch (NameUndefinedException e) {
            System.out.println("Imię nie zostało podane lub jest krótsze niż 2 litery");
        } catch (IncorrectAgeException e) {
            System.out.println("Wiek za niski");
        }
    }
}
