package Employee;

public class FullTimeEmployee extends Employee {
    private double salary;

    // Method to set the salary
    public void setSalary(double salary) {
        this.salary = salary;
    }

    // Override the getDetails method to include salary information
    @Override
    public String getDetails() {
        return super.getDetails() + "\nSalary: " + salary;
    }
}
