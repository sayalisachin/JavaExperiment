package standard_code;

import java.util.Scanner;

public class Employee {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Employee(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    // Getters and Setters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first name
        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        // Input last name
        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        // Input age
        System.out.print("Enter the age: ");
        int age = scanner.nextInt();

        // Input salary
        System.out.print("Enter the salary: ");
        double salary = scanner.nextDouble();

        // Create Employee object
        Employee employee = new Employee(firstName, lastName, age, salary);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Age: " + employee.getAge());
        System.out.println("Salary: " + employee.getSalary());

        scanner.close();
    }
}
