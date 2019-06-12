import java.util.Scanner;

public class TestPerson5 {

    public static void main(String[] args) throws NameUndefinedException, IncorrectAgeException {
        Scanner sc = new Scanner(System.in);
        PersonMethod ps = new PersonMethod();


        try {
            Person person = ps.askData();
            System.out.println(person);
        } catch (NameUndefinedException e) {
            System.out.println("Imię nie zostało podane lub jest krótsze niż 2 litery");
        } catch (IncorrectAgeException e) {
            System.out.println("Wiek za niski");
        }
    }
}
