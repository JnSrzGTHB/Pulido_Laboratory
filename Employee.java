public class Employee {

    private String Name; 
    private int Age;
    protected double Salary;

    public Employee(String Name, int Age, double Salary) {
        this.Name = Name;
        this.Age = Age;
        this.Salary = Salary;
    }

    public String getName() {
        return this.Name;
    }

    public int getAge() {
        return this.Age;
    }

    public double getSalary() {
        return this.Salary;
    }

    public void raiseSalary() {
        this.Salary = this.Salary * 1.2;
    }

    public static void main(String[] args) {
       
        Employee emp = new Employee("JinSuarez", 21, 5000);

        
        System.out.println("Name: " + emp.getName());
        System.out.println("Age: " + emp.getAge());
        System.out.println("Salary: " + emp.getSalary());

        emp.raiseSalary();

        System.out.println("New salary after raise: " + emp.getSalary());
    }
}
