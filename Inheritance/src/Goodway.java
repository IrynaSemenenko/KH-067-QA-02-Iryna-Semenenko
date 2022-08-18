public class Goodway extends Person {
    public Goodway(String name, String function, String job) {
        super(name, function, job);
    }
    public Goodway() {
        super("Goodway",
                "submits assignments for the paw patrol team",
                "mayor of Adventure Bay");
    }
    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("She is a " + getJob());
        System.out.println("Her function: " + getFunction() + "\n");
    }
}
