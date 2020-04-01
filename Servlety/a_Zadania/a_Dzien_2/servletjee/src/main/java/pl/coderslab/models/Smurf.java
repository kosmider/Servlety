package pl.coderslab.models;

public final class Smurf {
    private String name;
    private String attribute;
    private String description;

    public Smurf(String name, String attribute, String description) {
        this.name = name;
        this.attribute = attribute;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getAttribute() {
        return attribute;
    }

    public String getDescription() {
        return description;
    }
}
