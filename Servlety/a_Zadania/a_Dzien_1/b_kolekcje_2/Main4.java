package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.*;

public class Main4 {
    public static void main(String[] args) {
/*
        Set<String> napisy = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String input = scanner.nextLine();

        while (!input.equals("exit")) {
            count++;
            napisy.add(input);
            input = scanner.nextLine();
        }
        System.out.println("Podanych napisów: " + count + "\nRozmiar kolekcji: " + napisy.size());
    }

 */

      //  int number = ScannerUtils.getInt("Podaj liczbe: ");
      //  String napis = ScannerUtils.getString("Podaj napis: ", "[ak]");

        Scanner scanner = new Scanner(System.in);
        Map<String, String> newMap = getMap();
        Set<String> keys = newMap.keySet();
        int counter = 0;

        for (String key : keys
        ) {
            System.out.print("Podaj przeciwienstwo do " + key + ": ");
            String input = scanner.nextLine();
            String value = newMap.get(key);
            if(input.equals(value)){
                counter ++;
            }
        }
        System.out.println("Udzieliles: " + counter + " poprawnych odpowiedzi.");

        int counter1 = 0;
        Map<String, Integer> cityMap = getCity();
        Scanner scanner1 = new Scanner(System.in);

        Set<String> keysCity = cityMap.keySet();


        for (String key1: keysCity
             ) {
            System.out.print("Podaj populacje miasta " + key1 + ":");
            String answer = scanner1.nextLine();
            Integer value1 = cityMap.get(key1);
            if(answer.equals(value1.toString())) {
                counter1++;
            }
        }
        System.out.println("Udzieliłeś: " + counter1 + " poprawnych odp.");



        Map<String, Integer> footballers = new HashMap<>();
        int counter2 = 0;
        Scanner scanner2 = new Scanner(System.in);

        footballers = getFootballer();
        Set<String> ke = footballers.keySet();

        for (String k: ke
             ) {
            System.out.print("Podaj wiek piłkarza " + k + ": ");
            String odp = scanner2.nextLine();
            Integer age = footballers.get(k);

            if(odp.equals(age.toString())) {
                counter2++;
            }

        }
        System.out.println("Odgadłeś wiek piłkarza: " + counter2 + " razy");

    }

    private static Map<String, String> getMap() {

        Map<String, String> returnMap = new HashMap<>();
        returnMap.put("cieplo", "zimno");
        returnMap.put("biale", "czarne");
        returnMap.put("maly", "duzy");
        returnMap.put("gruby", "chudy");
        returnMap.put("niski", "wysoki");
        return returnMap;
    }

    private static Map<String, Integer> getCity() {
        Map<String, Integer> cityMap = new HashMap<>();
        cityMap.put("Warsaw", 1700000);
        cityMap.put("Krakow", 771100);
        cityMap.put("Wroclaw", 641600);
        cityMap.put("Katowice", 302000);
        return cityMap;
    }

    private static Map<String, Integer> getFootballer() {
        Map<String, Integer> footballersMap = new HashMap<>();
        footballersMap.put("Lewandowski", 31);
        footballersMap.put("Messi", 32);
        footballersMap.put("Ronaldo", 34);
        footballersMap.put("Salah", 31);

        return footballersMap;
    }

    //dodaje do Mapy w nieupożądkowany niezrozumiały sposób ZAPYTAĆ DLACZE>GO?!!
}
