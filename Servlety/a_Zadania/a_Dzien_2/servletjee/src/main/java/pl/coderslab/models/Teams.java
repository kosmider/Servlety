package pl.coderslab.models;

public class Teams {
    private String name;
    private Integer champions;
    private String adress;

    public Teams(String name, Integer champions, String adres) {
        this.name = name;
        this.champions = champions;
        this.adress = adres;
    }

    public String getName() {
        return name;
    }

    public Integer getChampions() {
        return champions;
    }

    public String getAdress() {
        return adress;
    }
}
