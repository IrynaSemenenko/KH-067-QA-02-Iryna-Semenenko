public abstract class Character {
    private String name;
    private String whoIsThis;

    public Character() {
    }

    public String getName() {
        return name;
    }

    public String getWhoIsThis() {
        return whoIsThis;
    }

    public Character(String name, String whoIsThis) {
        this.name = name;
        this.whoIsThis = whoIsThis;
    }

    public abstract void description();

}
