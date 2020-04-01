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

import java.util.*;

public class Main1 {
    public static void main(String[] args) {

        Set<String> inputs = new HashSet<>();
        int count = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wartość. exit - zakończ program");
        String input = s.nextLine();

        while (!input.equals("exit")) {
            count++;
            inputs.add(input);
            System.out.println(input);
            System.out.println("Podaj wartość. exit - zakończ program");
            input = s.nextLine();
        }
        System.out.println("Podanych napisów: "+count+"\n" +
                "Rozmiar kolekcji: "+inputs.size()+"");
        System.out.println("Koniec programu");

        Set<String> player = new HashSet<>();
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert player name or type exit to finish the program");
        System.out.print("Insert name: ");
        String playerName = scanner.nextLine();

        while (!playerName.equalsIgnoreCase("exit")) {
            counter++;
            System.out.print("Insert name: ");
            player.add(playerName);
            playerName = scanner.nextLine();
        }
        System.out.println("Number of attempts to enter data: " + counter + "\n" +
                "Number of players: " + player.size());
        System.out.println(player);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Jasmin Buric");
        map.put(2, "Jovan Stefanovic");
        map.put(3, "Grigori Sakaszwili");
        map.put(4, "Noise Somba");

        System.out.println(map);
        map.replace(3, "Moniks");

        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            String value = map.get(key);
            System.out.println(value);
        }
    }
}
