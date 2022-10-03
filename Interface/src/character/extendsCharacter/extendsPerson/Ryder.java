package character.extendsCharacter.extendsPerson;

import character.extendsCharacter.Person;
import interfaces.Gender;
import interfaces.HasUniform;

public class Ryder extends Person implements Gender, HasUniform {
    private final String GENDER = "male";

    public Ryder(String name, String function, String job) {
        super(name, function, job);
    }

    public Ryder() {
        super("character.extendsCharacter.extendsPerson.Ryder",
                "leader of the Paw Patrol team",
                "savior");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getJob());
        System.out.println("His function: " + getFunction());
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
        return "blue with red and white accents";
    }

    @Override
    public boolean hasCap() {
        return false;
    }

    @Override
    public boolean getUniform() {
        return true;
    }
}
