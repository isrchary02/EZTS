package Employee;

public class PartTimeEmployee extends Employee{
    double hourlyWages;

    public void setHourlyWages(double hourlyWages){
        this.hourlyWages = hourlyWages;
    }

    public String getDetails(){
        return super.getDetails() + "\nHourly Wages: " + hourlyWages;
    }
}
