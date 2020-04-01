package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/*
1. Napisz metodę `public static Map<String, String> getMap()`, która utworzy 5 dowolnych zestawów przeciwieństw (np. ciepło - zimno), doda je do mapy, a następnie zwróci.
2. W metodzie main programu, dla każdego klucza mapy, pobieraj z konsoli odpowiedź użytkownika.
3. Program ma zadać 5 pytań.
4. Po udzieleniu ostatniej odpowiedzi - ma wyświetlić wynik w postaci `Poprawnych odpowiedzi: 3`;

 */
public class Main2 {
    public static void main(String[] args) {
        int counter = 0;
        int secCounter = 0;
        Scanner s = new Scanner(System.in);

        Map<String, String> opposites = getMap();
        Set<String> keys = opposites.keySet();

        for (String key : keys) {
            System.out.println("Podaj przeciwienstwo do: " + key);
            String answer = s.nextLine();
            String value = opposites.get(key); // pobieramy wartość na podstawie klucza
            if (answer.equals(value)) {
                counter++;

            }

        }
        System.out.println("Poprawnych odpowiedzi: " + counter + "");


        Map<String, Integer> cities = getCity();
        Set<String> keys1 = cities.keySet();
        for (String key1 : keys1) {
            System.out.println("Podaj populacje miasta: " + key1);
            Integer userAnswer = s.nextInt();
            Integer cityPopulation = cities.get(key1);

            if (userAnswer.equals(cityPopulation)) {
                secCounter++;
            }
        }
        System.out.println("Zgadłeś: " + secCounter + " razy");
    }

    public static Map<String, String> getMap() {
        Map<String, String> map = new HashMap<>();
        map.put("ciepło", "zimno");
        map.put("białe", "czarne");
        map.put("duże", "małe");
        map.put("dobre", "złe");
        map.put("kwaśne", "słodkie");

        return map;
    }

    public static Map<String, Integer> getCity() {
        Map<String, Integer> cities = new HashMap<>();
        cities.put("Orlando", 1233);
        cities.put("Berlin", 2132);
        cities.put("Katowice", 534);

        return cities;
    }
}


//Zapytac o klucz (dowolna ilosc po enterze - poki nie wpisze sie exit)
//umiescic wartosci w mapie - przypisac je do jednego klucza?
