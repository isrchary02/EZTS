// Date:- 23 May 2024
// 4. Write a program to manage different types of employees in a company by creating a base class named 'Employee' and two derived classes named 'FullTimeEmployee' and 'PartTimeEmployee'. The base class 'Employee' should have a method named 'setDetails' that takes the name and age of the employee as parameters, and another method named 'getDetails' that returns the details of the employee.

package Employee;

public class Employee {
    String name;
    int age;

    public void setDetails(String name, int age){
        this.name = name;
        this.age = age;
    }

    public String getDetails(){
        return "Name: " + name + "\nAge: " + age;
    }
}
