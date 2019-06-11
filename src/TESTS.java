import java.util.InputMismatchException;
import java.util.Scanner;

public class TESTS {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TESTS_METHODS tests_methods = new TESTS_METHODS();

            String ok = null;
        do {
            try {
                   ok = tests_methods.askQuestion();
            } catch (NameUndefinedException ex) {
                System.out.println("Za długi napis");
            }
        }
        while (ok.length() != 3);


        System.out.println("\n\nTen dziwny tekst\n\n");


        System.out.println("Podaj liczbę: ");
        int number = 0;
        boolean error = true;
        do {
            try {
                number = sc.nextInt();
                error = false;
                System.out.println("Wczytano poprawną liczbę");
            } catch (InputMismatchException e) {
                System.out.println("Nie podałeś liczby całkowitej, spróbuj jeszcze raz: ");
                sc.nextLine();
            }
        } while (error);
        System.out.println("Podałeś: " + number);


    }
}
