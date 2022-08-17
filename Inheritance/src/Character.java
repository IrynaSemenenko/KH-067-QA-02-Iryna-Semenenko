public abstract class Character {
    private String name;
    private String whoIsThis;

    public abstract String getName();

    public abstract String getWhoIsThis();

    public Character(String name, String whoIsThis) {
        this.name = name;
        this.whoIsThis = whoIsThis;
    }
    public abstract void description();

}
