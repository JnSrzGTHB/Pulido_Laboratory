// Subclass: Teacher (extends Person)
public class Teacher extends Person {
    // Additional field for Teacher
    private String subject;

    // Constructor that accepts name, id, and subject
    public Teacher(String name, int id, String subject) {
        super(name, id); // Call parent constructor
        this.subject = subject;
    }

    // Override displayInfo() to include subject
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Subject: " + subject);
    }
}
