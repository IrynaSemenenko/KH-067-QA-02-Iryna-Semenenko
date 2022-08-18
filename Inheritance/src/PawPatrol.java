public class PawPatrol extends Character {
    private String superPower;
    private String breed;

    public String getSuperPower() {
        return superPower;
    }

    public String getBreed() {
        return breed;
    }

    public PawPatrol(String name, String function, String superPower, String breed) {
        super(name, function);
        this.superPower = superPower;
        this.breed = breed;
    }
    @Override
    public void description() {
        System.out.println(getName() + " is "+ getBreed() + ", " + getSuperPower() + " and " + getFunction() + "\n");
    }
}
