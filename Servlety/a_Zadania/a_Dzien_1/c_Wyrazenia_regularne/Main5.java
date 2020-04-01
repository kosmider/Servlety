package a_Zadania.a_Dzien_1.c_Wyrazenia_regularne;

import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("exit")) {
            System.out.println(verifyEmail(scanner.next()));
        }

    }

    static boolean verifyEmail(String email) {
        return email.matches("[\n" +
                "_\n" +
                "a-zA-Z0-9-]+(\\.[\n" +
                "_\n" +
                "a-zA-Z0-9-]+)*@[a-zA-Z0-9-]+(\\.[a-zA-Z0-9-]+)*\\.([a-zA-Z]{2,}){1}");
    }
}
