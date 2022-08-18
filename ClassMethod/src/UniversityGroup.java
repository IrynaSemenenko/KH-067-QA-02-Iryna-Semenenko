import java.util.Arrays;

public class UniversityGroup {
    private final String groupName;
    private final int startYear;
    private int endYear;
    private String[] studentArray;
    public String getGroupName() {
        return groupName;
    }
    public int getStartYear() {
        return startYear;
    }
    public String[] getStudentArray() {
        return studentArray;
    }
    public int getEndYear() {
        return endYear;
    }
    public int setEndYear() {
        return startYear + 5;
    }
    public UniversityGroup(String groupName, int startYear) {
        this.groupName = groupName;
        this.startYear = startYear;
        setEndYear();
    }
    public UniversityGroup(String groupName, int startYear, String[] studentArray) {
        this.groupName = groupName;
        this.startYear = startYear;
        this.studentArray = studentArray;
        setEndYear();
    }
    public String[] addStudents() {
        String[] students;
        students = new String[]{"Nikita", "Anatoliy", "Olga"};
        return students;
    }
    public void getGroupDescription() {
        if (getStudentArray() == null) {
            System.out.println(groupName);
            System.out.println("Years of study: " + startYear + " - " + setEndYear());
            System.out.println("Students: " + Arrays.toString(addStudents()));
        } else {
            System.out.println(groupName);
            System.out.println("Years of study: " + startYear + " - " + setEndYear());
            System.out.println("Students: " + Arrays.toString(getStudentArray()));
        }
    }
}

