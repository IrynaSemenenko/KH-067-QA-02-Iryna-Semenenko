public class Person extends Character {
    private String job;

    public String getJob() {
        return job;
    }

    public Person(String name, String function, String job) {
        super(name, function);
        this.job = job;
    }

    public void description() {
        System.out.println(getName() + "  " + getJob() + "  " + getFunction());
    }
}
