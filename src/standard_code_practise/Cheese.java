package standard_code_practise;

import java.util.Scanner;

public class Cheese {
    private String firstname;
    private String lastname;
    private int age;
    private double salary;

    public Cheese(String firstname, String lastname, int age, double salary){
        this.firstname=firstname;
        this.lastname=lastname;
        this.age=age;
        this.salary=salary;
    }
    public String getFirstName(){
        return firstname;
    }
    public void setFirstName(String firstname){
        this.firstname=firstname;
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
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter first name");
        
    }
    

}
