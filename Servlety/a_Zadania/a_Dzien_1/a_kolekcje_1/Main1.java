package a_Zadania.a_Dzien_1.a_kolekcje_1;

//#### Zadanie 1 - rozwiązywane z wykładowcą.
//
//        W pliku `Main1.java`
//
//        1. W metodzie `main` utwórz listę o nazwie `elements` przechowującą elementy typu Integer.
//        2. Dodaj do kolekcji 10 elementów od 10 do 19.
//        3. Wypisz elementy na konsoli używając pętli for.
//        4. Wypisz elementy na konsoli używając iteratora i pętli while.
//        5. Wypisz na konsoli elementy używając iteratora i pętli for.
//        6. Wypisz na konsoli elementy używając konstrukcji for-each.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main1 {
    public static void main(String[] args) {

        //1
        List<Integer> elements = new ArrayList<>();
        //2
        for (int i = 10; i < 20; i++) {
            elements.add(i);
        }
        //3
        System.out.println("punkt 3");
        for (int i = 0; i < elements.size(); i++) {
            final Integer value = elements.get(i);
            System.out.println(value);

        }
        System.out.println("punkt 4");
        final Iterator<Integer> it = elements.iterator();
        while (it.hasNext()) {
            final Integer value = it.next();
            System.out.println(value);

        }


        System.out.println("punkt 5");
        for (final Iterator<Integer> it2 = elements.iterator(); it2.hasNext(); ) {
            final Integer value = it2.next();
            System.out.println(value);
        }

        System.out.println("punkt 6");
        for (Integer value : elements) {
            System.out.println(value);

        }

        List<String> stringList = new ArrayList<>();
        stringList.add("Jan");
        stringList.add("Sebastian");
        stringList.add("Marcin");
        stringList.add("Lotek");
        stringList.add("Krzysiek");

        Iterator<String> iterator = stringList.iterator();
        while (iterator.hasNext()) {
            String val = iterator.next();
            System.out.println(val);
        }

        for (Iterator<String> iter = stringList.iterator(); iter.hasNext(); ) {
            System.out.println(iter.next());
        }

        for (String list : stringList
        ) {
            System.out.println(list);
        }
    }
}