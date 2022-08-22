public interface Gender {
    String getMaleGender();

    String getFeMaleGender();

    default void getGender() {
        if (getMaleGender().equals("male")) {
            System.out.println("Gender: " + getMaleGender());
        } else {
            System.out.println("Gender: " + getFeMaleGender());
        }
    }
}
