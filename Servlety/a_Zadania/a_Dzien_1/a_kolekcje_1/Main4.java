/*
#### Zadanie 4

W pliku `Main4.java`:
1. Napisz metodę `public static List<City> reverse (List<City> list )`,
która zwróci listę elementów w odwrotnej do otrzymanej kolejności.
2. Zapoznaj się z możliwościami klasy [ListIterator][list-iterator].

 */
package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Main4 {
    public static void main(String[] args) {
        final List<City> cityList = Main3.initialize();
        System.out.println(String.format("Reduce city list: %s",reduceCityList(cityList)));
        
        final List<City> cities = Main3.initialize();
        System.out.println("List: ");
        for (City c : cities
        ) {
            System.out.println(c);
        }
        System.out.println("\nReversed list: ");
        List<City> reversedCities = reverse(cities);

        for (City city : reversedCities
        ) {
            System.out.println(city);
        }
    }

    private static List<City> reverse(List<City> list) {
        List<City> reversedList = new ArrayList<>();
        ListIterator<City> listIterator = list.listIterator(list.size());

        while (listIterator.hasPrevious()) {
            City city = listIterator.previous();
            reversedList.add(city);

        }
        return reversedList;
    }

    private static List<City> reduceCityList(List<City> list) {
        List<City> cityListToReturn = new ArrayList<>();
        ListIterator<City> listIterator = list.listIterator();


        while (listIterator.hasNext()) {
            String str = listIterator.next().getName(list);
            char[] chars = str.toCharArray();
            char ch = chars[0];
            if (ch == 'W'){
                cityListToReturn.add(listIterator.previous());
                cityListToReturn.add(listIterator.next());
            }
        }
        return cityListToReturn;
    }
}

//1 przejsc po liscie
//2 wydobyc nazwe miasta
//3 rozbic nazwe miasta na listerki
//4 sprawdzic czy zaczyna sie na dana literke - regexy
//5 jesli tak to dodac element poprzedzajacy i nastepny
//6 zwrocic nowo utworzona liste
/*
#### Jak zamienić napis na tablicę elementów typu char.
        ```Java
String str = new String("Java");
char[] array = str.toCharArray();
```

 */