package a_Zadania.a_Dzien_1.b_kolekcje_2;

public class Country {
    String name;
    String capital;

    @Override
    public String toString() {
        return name + ": " + capital;
    }

    public Country(String name, String capital) {
        this.name = name;
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }
}
