package testing.lab10;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

class Employee implements Serializable {
    private static final long serialVersionUID = 1L;

    private int employeeId;
    private String name;
    private double basicSalary;
    private double allowances;
    private double deductions;

    public Employee(int employeeId, String name, double basicSalary, double allowances, double deductions) {
        this.employeeId = employeeId;
        this.name = name;
        this.basicSalary = basicSalary;
        this.allowances = allowances;
        this.deductions = deductions;
    }

    public double calculateNetSalary() {
        return basicSalary + allowances - deductions;
    }

    @Override
    public String toString() {
        return "Employee ID: " + employeeId +
               "\nName: " + name +
               "\nBasic Salary: " + basicSalary +
               "\nAllowances: " + allowances +
               "\nDeductions: " + deductions +
               "\nNet Salary: " + calculateNetSalary();
    }
}

public class EmployeeSerialization {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee(101, "John Doe", 50000.0, 8000.0, 5000.0));
        employees.add(new Employee(102, "Jane Smith", 45000.0, 7000.0, 4000.0));

        // Serialize employee objects
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employees.ser"))) {
            oos.writeObject(employees);
            System.out.println("Employee data written to file.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Deserialize and display employee objects
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("employees.ser"))) {
            List<Employee> readEmployees = (List<Employee>) ois.readObject();
            for (Employee employee : readEmployees) {
                System.out.println("\nEmployee Information:\n" + employee);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

