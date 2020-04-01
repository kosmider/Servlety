package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

public class Dodatkowe {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<String> inputs = new ArrayList<>();

        Scanner s = new Scanner(System.in);
        System.out.println("Podaj wartość. exit - zakończ program");
        String input = s.next();

        while (!input.equals("exit")) {

            inputs.add(input);
            //System.out.println("Podaj wartość. exit - zakończ program");
            input = s.next();
            map.put(1, String.valueOf(inputs));
        }
        System.out.println(map);
    }
}
