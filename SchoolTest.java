
public class SchoolTest {
    public static void main(String[] args) {
        
        Student student = new Student("Jin Suarez", 2024, "1st year college");
        Teacher teacher = new Teacher("Sir Archie", 201, "Programming");
        Staff staff = new Staff("Mary Johnson", 301, "Administration");

     
        System.out.println("Student Information:");
        student.displayInfo();
        System.out.println();

        System.out.println("Teacher Information:");
        teacher.displayInfo();
        System.out.println();

        System.out.println("Staff Information:");
        staff.displayInfo();
    }
}
