package character.extendsCharacter.extendsPawPatrol;

import character.extendsCharacter.PawPatrol;

public class Chase extends PawPatrol {
    public Chase(String name, String function, String superPower, String breed) {
        super(name, function, superPower, breed);
    }

    public Chase() {
        super("Chase",
                "acting as commander, police officer and super spy",
                "super speed",
                "german shepherd puppy");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getBreed());
        System.out.println("His function: " + getFunction());
        System.out.println("His super power:  " + getSuperPower() + "\n");
    }
}
