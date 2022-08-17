public class Ryder extends Person {

    @Override
    public String getName() {
        return "Ryder";
    }
    @Override
    public String getWhoIsThis() {
        return "leader of the Paw Patrol";
    }
    @Override
    public String getJob() {
        return "savior";
    }

    public Ryder(String name, String whoIsThis, String job) {
        super(name, whoIsThis, job);
    }

    public Ryder() {
        super("Ryder", "leader of the Paw Patrol", "Savior");
    }
    public void description() {
        System.out.println(getName() + ": ");
        System.out.println("He is a " + getJob() + " and " + getWhoIsThis() + "\n");
    }
}
