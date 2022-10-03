package character.extendsCharacter.extendsPawPatrol;

import character.extendsCharacter.PawPatrol;
import interfaces.Gender;
import interfaces.HasUniform;

public class Chase extends PawPatrol implements Gender, HasUniform {
    private final String GENDER = "male";

    public Chase(String name, String function, String superPower, String breed) {
        super(name, function, superPower, breed);
    }

    public Chase() {
        super("character.extendsCharacter.extendsPawPatrol.Chase",
                "acting as commander, police officer and super spy",
                "super speed",
                "german shepherd puppy");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getBreed());
        System.out.println("His function: " + getFunction());
        System.out.println("His super power:  " + getSuperPower());
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
        return "blue";
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
