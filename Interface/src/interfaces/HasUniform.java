package interfaces;

public interface HasUniform {
    boolean UNIFORM = true;

    boolean hasCap();

    boolean getUniform();

    String colorUniform();

    default void uniformDescription() {
        if (getUniform() == UNIFORM) {
            System.out.println("Uniform colors: " + colorUniform());
            System.out.println("The presence of a cap: " + hasCap());
        } else {
            System.out.println("Character.Character does not have uniform");
        }
    }
}
