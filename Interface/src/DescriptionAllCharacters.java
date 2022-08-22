public class DescriptionAllCharacters {
    public static void main(String[] args) {
        System.out.println("Let's look at the characters of the Paw Patrol game:\n");
        Goodway goodway = new Goodway();
        goodway.description();
        goodway.getGender();
        goodway.uniformDescription();
        System.out.println();
        Ryder ryder = new Ryder();
        ryder.description();
        ryder.getGender();
        ryder.uniformDescription();
        System.out.println();
        Chase chase = new Chase();
        chase.description();
        chase.getGender();
        chase.uniformDescription();
        System.out.println();
        Marshall marshall = new Marshall();
        marshall.description();
        marshall.getGender();
        marshall.uniformDescription();
    }
}
