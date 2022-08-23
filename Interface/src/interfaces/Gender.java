package interfaces;

public interface Gender {
    String getMaleGender();

    String getFeMaleGender();

    default void getGender() {
        if (getMaleGender().equals("male")) {
            System.out.println("interfaces.Gender: " + getMaleGender());
        } else {
            System.out.println("interfaces.Gender: " + getFeMaleGender());
        }
    }
}
