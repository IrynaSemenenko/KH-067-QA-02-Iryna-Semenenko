public class PawPatrol extends Character {
    private String superPower;

    public String getSuperPower() {
        return superPower;
    }
    public PawPatrol(String name, String whoIsThis, String superPower) {
        super(name, whoIsThis);
        this.superPower = superPower;
    }
    @Override
    public void description() {
        System.out.println(getName() + " is " + getSuperPower() + " and " + getWhoIsThis() + "\n");
    }
}
