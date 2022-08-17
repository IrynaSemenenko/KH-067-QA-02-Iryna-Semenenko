public class Chase extends PawPatrol{
    public Chase(String name, String whoIsThis, String superPower) {
        super(name, whoIsThis, superPower);
    }
    public Chase() {
        super("Chase", "german shepherd, team leader", "super speed");
    }
    public void description() {
        System.out.println(getName() + ": ");
        System.out.println("He is a " + getWhoIsThis() + ". Has " + getSuperPower() + "\n");
    }
}
