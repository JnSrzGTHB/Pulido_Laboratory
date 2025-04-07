// Subclass: Staff (extends Person)
public class Staff extends Person {
    // Additional field for Staff
    private String department;

    // Constructor that accepts name, id, and department
    public Staff(String name, int id, String department) {
        super(name, id); // Call parent constructor
        this.department = department;
    }

    // Override displayInfo() to include department
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call parent method
        System.out.println("Department: " + department);
    }
}
