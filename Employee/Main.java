package Employee;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Full Time Employee
        FullTimeEmployee ftEmployee = new FullTimeEmployee();
        System.out.println("Enter the name of the Full Time Employee: ");
        String ftName = sc.nextLine();

        System.out.println("Enter the age of the Full Time Employee: ");
        int ftAge = sc.nextInt();

        System.out.println("Enter the salary of the Full Time Employee: ");
        double ftSalary = sc.nextDouble();

        // Consume the leftover newline
        sc.nextLine();

        ftEmployee.setDetails(ftName, ftAge);
        ftEmployee.setSalary(ftSalary);

        System.out.println("Full Time Employee Details:");
        System.out.println(ftEmployee.getDetails());

        // Part Time Employee
        PartTimeEmployee ptEmployee = new PartTimeEmployee();
        System.out.println("\nEnter the name of the Part Time Employee: ");
        String ptName = sc.nextLine();

        System.out.println("Enter the age of the Part Time Employee: ");
        int ptAge = sc.nextInt();

        System.out.println("Enter the Hourly Wages of the Part Time Employee: ");
        double hourlyWages = sc.nextDouble();

        // Consume the leftover newline
        sc.nextLine();

        ptEmployee.setDetails(ptName, ptAge);
        ptEmployee.setHourlyWages(hourlyWages);

        sc.close();

        System.out.println("Details of Part Time Employee: \n");
        System.out.println(ptEmployee.getDetails());
    }
}
