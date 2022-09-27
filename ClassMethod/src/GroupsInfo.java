public class GroupsInfo {

    public static void main(String[] args) {
        UniversityGroup firstGroup = new UniversityGroup("FirstGroup", 2020, new String[]{"Anna", "Ira", "Anton"});
        firstGroup.addStudents();
        firstGroup.getGroupDescription();
        UniversityGroup secondGroup = new UniversityGroup("SecondGroup", 2018);
        secondGroup.addStudents();
        secondGroup.getGroupDescription();
    }
}
