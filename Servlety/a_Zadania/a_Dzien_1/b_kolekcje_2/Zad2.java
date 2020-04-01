/*
/*W pliku `Main1.java`:
1. Napisz program który w metodzie main będzie w pętli pobierał z konsoli napisy, do momentu podania `exit`.
2. Pobrane od użytkownika napisy dodawaj do kolekcji typu `Set`.
3. Utwórz zmienną typu `int` o nazwie `count` i wartości początkowej 0.
4. Po pobraniu napisu zwiększaj wartość zmiennej `count`.
3. Testując program podaj kilkukrotnie ten sam napis.
4. Po wpisaniu `exit` wypisz na konsoli: `Podanych napisów: [liczba napisów],
 Rozmiar kolekcji: [liczba elementów w kolekcji]`
 */

package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Zad2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> strings = new HashSet<>();
        int counter = 0;
        System.out.println("Podaj wartość, exit - zakończ program");
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            counter ++;
            strings.add(input);
            System.out.println("Podaj wartość, exit - zakończ program");
            input = scanner.nextLine();
        }

        System.out.println(("Podanych napisów:  " + counter +
                "\nRozmiar kolekcji: " + strings.size()));
    }
}
