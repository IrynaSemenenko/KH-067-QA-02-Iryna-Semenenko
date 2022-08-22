public class PawPatrol extends Character {
    private String superPower, breed;

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
        System.out.println(getName() + "  " + getBreed() + "  " + getSuperPower() + "  " + getFunction());
    }
}
