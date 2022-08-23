package character.extendsCharacter.extendsPerson;

import character.extendsCharacter.Person;
import interfaces.Gender;
import interfaces.HasUniform;

public class Goodway extends Person implements Gender, HasUniform {
    private final String GENDER = "female";

    public Goodway(String name, String function, String job) {
        super(name, function, job);
    }

    public Goodway() {
        super("character.extendsCharacter.extendsPerson.Goodway",
                "submits assignments for the paw patrol team",
                "mayor of Adventure Bay");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("She is a " + getJob());
        System.out.println("Her function: " + getFunction());

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
        return null;
    }

    @Override
    public boolean hasCap() {
        return false;
    }

    @Override
    public boolean getUniform() {
        return false;
    }
}
