public class GroupsInfo {

    public static void main(String[] args) {
        UniversityGroup firstGroupStudent = new UniversityGroup("FirstGroup", 2020, new String[]{"Anna", "Ira", "Anton"});
        firstGroupStudent.getGroupDescription();
        System.out.println();
        UniversityGroup secondGroup = new UniversityGroup("SecondGroup", 2018);
        secondGroup.getGroupDescription();
    }
}
