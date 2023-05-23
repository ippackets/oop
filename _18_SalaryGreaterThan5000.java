import java.util.Scanner;

class Person {
    protected String name;
    protected int age;

    public void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = scanner.nextLine();
        System.out.print("Enter age: ");
        age = scanner.nextInt();
    }
}

class Employee extends Person {
    private String designation;
    private double salary;

    public void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter salary: ");
        salary = scanner.nextDouble();
    }

    public void displayData() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Designation: " + designation);
        System.out.println("Salary: " + salary);
    }

    public boolean hasSalaryGreaterThan5000() {
        return salary > 5000;
    }
}

public class _18_SalaryGreaterThan5000{
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];

        // Accept data for 5 persons
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for person " + (i + 1) + ":");
            employees[i] = new Employee();
            employees[i].acceptData();
            System.out.println();
        }

        // Display names of employees with salary greater than 5000
        System.out.println("Names of employees with salary greater than 5000:");
        for (Employee employee : employees) {
            if (employee.hasSalaryGreaterThan5000()) {
                System.out.println(employee.name);
            }
        }
    }
}
