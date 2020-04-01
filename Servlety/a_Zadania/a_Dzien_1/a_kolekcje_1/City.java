package a_Zadania.a_Dzien_1.a_kolekcje_1;

import java.util.List;

public class City {
    String name;

    public String getName(List<City> list) {
        return name;
    }

    public int getPopulation() {
        return population;
    }

    int population;

    public City(String name, int population) {
        this.name = name;
        this.population = population;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", population=" + population +
                '}';
    }
}

