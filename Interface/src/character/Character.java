package character;

public abstract class Character {
    private String name, function;

    public String getName() {
        return name;
    }

    public String getFunction() {
        return function;
    }

    public Character() {
    }

    public Character(String name, String function) {
        this.name = name;
        this.function = function;
    }

    public abstract void description();
}
