package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

/*Utwórz klasę `Country`, dodaj w niej atrybuty:
        * name (String)
        * capital (String)

        Następnie w pliku `Main3.java`:
        1. Napisz metodę `public static List<Country> initialize ()`, która utworzy 5 obiektów klasy `Country`,
        doda je do listy, którą następnie zwróci.
        2. Napisz metodę `public static Map<String, Country> getMap (List<Country> list)`,
        która utworzy, a następnie zwróci mapę, gdzie kluczem będzie nazwa stolicy pobrana z obiektu `country`,
        a wartością referencja do obiektu `country`:
        3. W metodzie `main` wyświetl informacje w postaci:
        ```
   Berlin - Niemcy
   Warszawa - Polska
   ```
<!-- Links -->
        [list-iterator]:https://docs.oracle.com/javase/8/docs/api/java/util/ListIterator.html

 */


public class Main3 {

    public static void main(String[] args) {
        List<Country> list = initialize();

        Map<String, Country> countryMap = getMap(list);

        for (Map.Entry<String, Country> entry: countryMap.entrySet())  {
            String capital = entry.getKey();
            String country = entry.getValue().getName();
            System.out.println(String.format("%s - %s", capital, country));
        }
    }

    private static List<Country> initialize() {

        List<Country> countries = new ArrayList<>();

        Country spain = new Country("Spain", "Madrid");
        Country poland = new Country("Poland", "Warsaw");
        Country usa = new Country("USA", "Waszyngton");
        Country russia = new Country("Russia", "Moscow");
        Country belgium = new Country("Belgium", "Brussel");
        
        countries.add(spain);
        countries.add(poland);
        countries.add(usa);
        countries.add(russia);
        countries.add(belgium);

        return countries;
    }

    private static Map<String, Country> getMap(List<Country> list) {
        Map<String, Country> newMap = new HashMap<>();
        for (Country country : list
        ) {
            newMap.put(country.getCapital(), country);
        }
        return newMap;
    }
}

//klucz ktory przechowuje wiele wartosci
//Map<String, Collection> map;
//map.put()




