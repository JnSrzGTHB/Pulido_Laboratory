public class SalesPerson extends Employee {

    private double comissionPercentage;

    public SalesPerson( String name, int age, double comissionPercentage) {
        super(name , Salary, age);
        this.comissionPercentage = comissionPercentage;
    }

    public double getComissionPercentage() {
        return this.comissionPercentage;
    }

    public void raiseComission() {
    }
    

