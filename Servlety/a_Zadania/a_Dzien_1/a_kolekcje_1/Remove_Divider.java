package a_Zadania.a_Dzien_1.a_kolekcje_1;
/*
#### Zadanie 2 - rozwiązywane z wykładowcą.

W pliku `Main2.java` napisz metodę `public static void removeDivider (List<Integer> list, int divider)`,
która usunie z listy wszystkie elementy podzielne przez `divider`.

 */

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Remove_Divider {
    public static void main(String[] args) {

        List<Integer> newList = new ArrayList<>();
        newList.add(2);
        newList.add(3);
        newList.add(4);
        newList.add(5);

        removeDivider(newList, 2);

        for (Integer val: newList
             ) {
            System.out.print(val+ ", ");
        }

    }

    public static void removeDivider (List<Integer> list, int divider) {
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            final Integer value = iterator.next();
            if ((value % divider) == 0) {
                iterator.remove();
            }
        }
    }
}



