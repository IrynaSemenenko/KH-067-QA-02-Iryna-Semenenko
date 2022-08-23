package character.extendsCharacter.extendsPawPatrol;

import character.extendsCharacter.PawPatrol;

public class Marshall extends PawPatrol {
    public Marshall(String name, String function, String superPower, String breed) {
        super(name, function, superPower, breed);
    }

    public Marshall() {
        super("character.extendsCharacter.extendsPawPatrol.Marshall",
                "acting as a firefighter and a medic",
                "able to control heat and fire",
                "dalmatian puppy");
    }

    public void description() {
        System.out.println("Name: " + getName());
        System.out.println("He is a " + getBreed());
        System.out.println("His function: " + getFunction());
        System.out.println("His super power: " + getSuperPower() + "\n");
    }
}
