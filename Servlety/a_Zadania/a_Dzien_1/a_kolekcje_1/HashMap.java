package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.nio.file.Path;
import java.util.*;

public class HashMap {
    public static void main(String[] args) {
        Set<String> myHashSet = new HashSet<>();
        myHashSet.add("circle");
        myHashSet.add("square");
        myHashSet.add("circle");
        System.out.println(myHashSet.size() + " Wyświetli rozmiar 2 poniewaz zbiór Set umożliwia" +
                " przechowywanie tylko pojedynczych wartośći!");

        Set<Integer> hashSetExapmle = new HashSet<>();
        hashSetExapmle.add(3);
        hashSetExapmle.add(4);
        hashSetExapmle.add(5);
        hashSetExapmle.add(1);
        hashSetExapmle.add(5);
        hashSetExapmle.add(0);
        System.out.println("\n" + hashSetExapmle);


        List<String> list = new ArrayList<>();
        list.add("Przemek");
        list.add("Kośmider");
        list.add("Ilona");

        System.out.println(list.get(2));
        list.set(2, "Andrzej");
        System.out.println(list.get(2));
        System.out.println(list.remove(2));

        Iterator iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        System.out.println("ITERATOR");
        for (Iterator<String> it = list.iterator(); iterator.hasNext(); ) {
            System.out.println(it.next());
        }

        List<String> listaUczniow = new ArrayList();
        listaUczniow.add("Karol");
        listaUczniow.add("Julian");
        listaUczniow.add("Maks");
        listaUczniow.add("Maciek");
        listaUczniow.addAll(list);



        ListIterator listIterator = listaUczniow.listIterator();

        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
        System.out.println("\n\nZmiana na kacper");
        Iterator<String> iterator1 = listaUczniow.iterator();


        listaUczniow.set(3, "Kacper");


        for (int i = 0; i < listaUczniow.size(); i++) {
            if (listaUczniow.get(i).equals("Karol")) {
                listaUczniow.set(i, "Maczupikczu");
            }
        }

        while (iterator1.hasNext()) {
            System.out.println(iterator1.next());

        }


        System.out.println("\n\nZ użyciem pętli for: ");
        for (Iterator iterator2 = listaUczniow.iterator(); iterator2.hasNext(); ) {
            System.out.println(iterator2.next());
        }


        Map<Integer, String> map = new java.util.HashMap<>();
        map.put(1,
                "Black");
        map.put(2,
                "Black");
        map.put(3,
                "Black");
        map.put(3,
                "White");
        String mapValue = map.get(1);
        System.out.println(map);
        System.out.println(mapValue);


        System.out.println(map.keySet() + "Wyswietla wartosc kluczy");
        System.out.println(map.get(3));
        System.out.println(map.containsKey(4));
        System.out.println(map.containsValue("Black"));
        map.put(3, "Yellow");
        System.out.println(map);
        System.out.println(map.remove(1));
        System.out.println(map);

        Map<String, Integer> newMap = new java.util.HashMap<>();
        newMap.put("a", 1);
        newMap.put("b", 2);
        newMap.put("c", 3);
        newMap.put("d", 4);
        newMap.put("d", 4); //mapa nie pozwala na przechowywanie duplikatów!

        Set<String> keys = newMap.keySet();

        for (String key : keys
        ) {
            Integer value = newMap.get(key); // pobieramy wartość na podstawie klucza
            System.out.println(value);
        }
/*
Pobieramy klucze i wartości - korzystamy z metody
entrySet() :
w pętli foreach:

 */
        for (Map.Entry<String, Integer> entry : newMap.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " " + value);

// ...
        }
        Map<Integer, String> entryMap = new java.util.HashMap<>();

        entryMap.put(1, "Przemek");
        entryMap.put(2, "Ilona");
        entryMap.put(3, "Konrad");
        for (Map.Entry<Integer, String> entry : entryMap.entrySet()) {
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println("Key: " + key + "\n" + "Value: " + value);
        }
        /*
         Pobieramy klucze i wartości przy pomocy funkcji entrySet i iteratora:
         */
        Iterator it = newMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry keyValue = (Map.Entry) it.next();
            System.out.println(keyValue.getKey() + " = " + keyValue.getValue());
        }
    }
}
