// Subclass: Student (extends Person)
public class Student extends Person {
    // Additional field for Student
    private String gradeLevel;

    // Constructor that accepts name, id, and gradeLevel
    public Student(String name, int id, String gradeLevel) {
        super(name, id); // Call parent constructor
        this.gradeLevel = gradeLevel;
    }

    // Override displayInfo() to include gradeLevel
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Grade Level: " + gradeLevel);
    }
}
