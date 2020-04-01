package a_Zadania.a_Dzien_1.b_kolekcje_2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main5 {
    public static void main(String[] args) {
        List<Club> list = initialize();
        Map<String, Club> clubMap = getMap(list);

        for (Map.Entry<String, Club> entry : clubMap.entrySet()) {
            String name = entry.getKey();
            String city = entry.getValue().getCity();

            System.out.println(String.format("%s - %s", name, city));
        }

    }

    public static List<Club> initialize() {

        List<Club> clubs = new ArrayList<>();
        Club Bayern = new Club("Bayern", "Monachium");
        Club United = new Club("United", "Manchester");
        Club Benfica = new Club("Benfica", "Lizbona");
        Club Partizan = new Club("Partizan", "Belgrad");
        Club Spartac = new Club("Spartac", "Moskwa");

        clubs.add(Bayern);
        clubs.add(United);
        clubs.add(Benfica);
        clubs.add(Partizan);
        clubs.add(Spartac);

        return clubs;
    }

    //dla kazdego obiektu z listy pobierz nazwe i wstaw jako klucz nowej mapy stringClubMap
    //oraz pobierz referencje i wstaw jako wartość mapy stringClubMap
    public static Map<String, Club> getMap(List<Club> list) {
        Map<String, Club> stringClubMap = new HashMap<>();

        for (Club club : list
        ) {
            stringClubMap.put(club.getName(), club);
        }
        return stringClubMap;
    }
}
