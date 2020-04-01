package a_Zadania.a_Dzien_1.b_kolekcje_2;
import java.util.Scanner;

public class ScannerUtils {

    public static int getInt(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextInt()) {
            scanner.next();
            System.out.println("To nie jest liczba całkowita");
            System.out.print(prompt);
        }
        return scanner.nextInt();
    }

    public static String getString(String prompt, String pattern) {
        System.out.println(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext(pattern)) {
            scanner.next();
            System.out.println("Napis niezgodny ze wzorcem!");
            System.out.println(pattern);
        }
        return scanner.next(pattern);
    }

    public static String getStringSec(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static double getDouble(String prompt) {
        System.out.print(prompt);
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNextDouble()) {
            scanner.next();
            System.out.println("To nie jest poprawna liczba");
            System.out.print(prompt);
        }
        return scanner.nextDouble();

    }
}
//Scanner.getString("Podaj kierunek przeliczenia: ", "(nb)|(bn)"
