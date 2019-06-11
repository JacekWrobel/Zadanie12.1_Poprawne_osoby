import java.util.Scanner;

public class PersonMethod {

    Person askData() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj swoje imię");
        String firstName = sc.nextLine();

        System.out.println("Podaj swoje nazwisko");
        String lastName = sc.nextLine();

        System.out.println("Podaj swoj pesel");
        String pesel = sc.nextLine();

        System.out.println("Podaj swoj wiek");
        int age = sc.nextInt();

        return new Person(firstName, lastName, pesel, age);
    }

}
