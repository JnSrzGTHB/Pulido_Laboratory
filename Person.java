// Base class: Person
public class Person {
    // Instance variables
    private String name;
    private int id;

    // Constructor to initialize name and id
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display name and id
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
