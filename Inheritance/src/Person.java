public class Person extends Character {
    private String job;

    public String getJob() {
        return null;
    }

    @Override
    public String getName() {
        return null;
    }

    @Override
    public String getWhoIsThis() {
        return null;
    }

    public Person(String name, String whoIsThis, String job) {
        super(name, whoIsThis);
        this.job = job;
    }

    public void description() {
        System.out.println(getName() + " is " + getJob() + " and " + getWhoIsThis() + "\n");
    }
}
