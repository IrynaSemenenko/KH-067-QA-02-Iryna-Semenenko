public class Person extends Character {
    private String job;

    public Person() {
    }

    public String getJob() {
        return job;
    }

    public Person(String name, String whoIsThis, String job) {
        super(name, whoIsThis);
        this.job = job;
    }

    public void description() {
        System.out.println(getName() + " is " + getJob() + " and " + getWhoIsThis() + "\n");
    }
}
