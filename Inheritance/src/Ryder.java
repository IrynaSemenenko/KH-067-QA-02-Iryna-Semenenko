public class Ryder extends Person {
    public Ryder(String name, String function, String job) {
        super(name, function, job);
    }

    public Ryder() {
        super("Ryder", "leader of the Paw Patrol team", "savior");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getJob());
        System.out.println("His function: " + getFunction() + "\n");
    }
}
