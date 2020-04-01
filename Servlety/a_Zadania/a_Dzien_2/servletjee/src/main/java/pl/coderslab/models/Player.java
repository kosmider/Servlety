package pl.coderslab.models;

public class Player {
    private String name;
    private String secName;
    private int age;

    public Player(String name, String secName, int age) {
        this.name = name;
        this.secName = secName;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getSecName() {
        return secName;
    }

    public int getAge() {
        return age;
    }
}
