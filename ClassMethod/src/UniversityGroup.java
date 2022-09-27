import java.util.Arrays;
import java.util.Scanner;

public class UniversityGroup {
    private String groupName;
    private int startYear;
    private int endYear;
    private String[] studentArray;

    public String[] getStudentArray() {
        return studentArray;
    }

    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.endYear = startYear + 5;
    }

    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        this.endYear = startYear + 5;
    }

    public void addStudents() {
        if (studentArray == null) {
            Scanner sc = new Scanner(System.in);
            System.out.println("\nStudents array is empty for the " + groupName + ". \nPlease, enter the name of the students (format: name1, name2, ... nameX):");
            String enterStudents = sc.nextLine();
            this.studentArray = enterStudents.split(",");
        }
    }

    public void getGroupDescription() {
        System.out.println(groupName);
        System.out.println("Years of study: " + startYear + " - " + endYear);
        System.out.println("Students: " + Arrays.toString(getStudentArray()));
    }
}

