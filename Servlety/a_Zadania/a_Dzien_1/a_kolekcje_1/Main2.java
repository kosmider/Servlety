package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.*;

/*
#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `Main2.java` napisz metodę `public static void removeDivider (List<Integer> list, int divider)`,
która usunie z listy wszystkie elementy podzielne przez `divider`.

 */
public class Main2 {
    public static void main(String[] args) {



        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(3);
        integers.add(30);
        integers.add(5);
        //List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 30);
        removeDivider(integers, 3);
        for (Integer val : integers) {
            System.out.println(val);
        }


        List<String> list = new ArrayList<>();
        list.add("Tomek");
        list.add("Przemek");
        list.add("Jurek");
        list.add("Stefan");
        list.add("Przemek");
        list.add("Kacper");
        list.add("Jurek");
        list.add("Przemek");
        list.add("Kacper");
        list.add("Tomek");
        list.add("Kacper");


        list.removeAll(Collections.singleton("Kacper"));
        Iterator<String> iterator = list.iterator();


        while (iterator.hasNext()) {
            String output = iterator.next();
            if (output.equals("Tomek")) {
                output = "Romek";
            }

            System.out.println(output);
        }
    }

    private static void removeDivider(List<Integer> list, int divider) {
        final Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            final Integer value = it.next();
            if ((value % divider) == 0) {
                it.remove();
            }
        }



    }

}
