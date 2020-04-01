/*
#### Zadanie 3

Utwórz klasę `City`,  dodaj w niej atrybuty:
* name (String)
* population (int)

Klasa powinna mieć też konstruktor przyjmujący wszystkie 2 parametry

Następnie w pliku `Main3.java`:
1. Napisz metodę `public static List<City> initialize()`, która utworzy 5 obiektów klasy `City`,
 doda je do listy, którą następnie zwróci.
2. Napisz metodę `public static List<City> firstSubList(List<City> list, int start, int end )`,
która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`. Wykorzystaj dowolną pętlę.
3. Napisz metodę `public static List<City> secondSubList(List<City> list, int start, int end )`,
   która zwróci sublistę elementów listy `list` o początku `start` i końcu `end`.
    Wykorzystaj wbudowaną metodę `List.subList(int fromIndex, int toIndex)`.
 */
package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;

public class Main3 {
    public static void main(String[] args) {
        final List<City> cities = initialize();
        System.out.println(String.format("Lista miast: %s", cities));

        List<City> subList = firstSubList(cities, 2, 4);
        System.out.println(String.format("First sublist: %s", subList));

        List<City> secondSublist = secondSubList(cities, 2, 4);
        System.out.println(String.format("Sec sublist: %s", secondSublist));
    }

    public static List<City> initialize() {
        City londyn = new City("Londyn", 213321);
        City moskwa = new City("Moskwa", 40000);
        City dubaj = new City("Dubaj", 2);
        City warszawa = new City("Warszawa", 21);
        City helsinki = new City("Helsinki", 3321);

        List<City> list = new ArrayList<>();
        list.add(londyn);
        list.add(moskwa);
        list.add(dubaj);
        list.add(warszawa);
        list.add(helsinki);

        return list;
    }

    public static List<City> firstSubList(List<City> list, int start, int end) {
        List<City> newCityList = new ArrayList<>();

        for (int i = start; i < end; i++) {
            City city = list.get(i);
            newCityList.add(city);
        }
        return newCityList;
    }

    public static List<City> secondSubList(List<City> list, int start, int end) {

        return list.subList(start, end);
    }
}
