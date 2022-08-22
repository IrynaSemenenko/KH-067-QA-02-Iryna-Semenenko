public class Marshall extends PawPatrol implements Gender, HasUniform {
    private final String GENDER = "male";

    public Marshall(String name, String function, String superPower, String breed) {
        super(name, function, superPower, breed);
    }

    public Marshall() {
        super("Marshall",
                "acting as a firefighter and a medic",
                "able to control heat and fire",
                "dalmatian puppy");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getBreed());
        System.out.println("His function: " + getFunction());
        System.out.println("His super power: " + getSuperPower());
    }

    @Override
    public String getMaleGender() {
        return GENDER;
    }

    @Override
    public String getFeMaleGender() {
        return GENDER;
    }

    @Override
    public String colorUniform() {
        return "red";
    }

    @Override
    public boolean hasCap() {
        return true;
    }

    @Override
    public boolean getUniform() {
        return true;
    }
}
