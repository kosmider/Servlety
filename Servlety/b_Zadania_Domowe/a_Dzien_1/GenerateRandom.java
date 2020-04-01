package b_Zadania_Domowe.a_Dzien_1;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Set;

public class GenerateRandom {
    public static void main(String[] args) {
        Map<Integer, Integer> map = checkRand(300, 5);
        Set<Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println(key + ": " + map.get(key));
        }
    }
/*
V get(Object key) – zwraca wartość z określonego klucza.
Set<K> keySet() – zwraca zbiór kluczy
 */
    public static Map<Integer, Integer> checkRand(int amount, int interval) {
        Map<Integer, Integer> map = new HashMap<>();
        Random generator = new Random();

        for (int i = 0; i < amount; i++) {
            int number = generator.nextInt(interval);
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }
        return map;
    }
}
