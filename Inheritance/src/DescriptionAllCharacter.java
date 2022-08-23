import character.extendsCharacter.extendsPawPatrol.Chase;
import character.extendsCharacter.extendsPawPatrol.Marshall;
import character.extendsCharacter.extendsPerson.Goodway;
import character.extendsCharacter.extendsPerson.Ryder;

public class DescriptionAllCharacter {
    public static void main(String[] args) {
        System.out.println("Let's look at the characters of the Paw Patrol game\n");
        Goodway goodway = new Goodway();
        goodway.description();
        Ryder ryder = new Ryder();
        ryder.description();
        Chase chase = new Chase();
        chase.description();
        Marshall marshall = new Marshall();
        marshall.description();
    }
}
