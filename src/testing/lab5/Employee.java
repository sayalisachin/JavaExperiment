import java.util.Scanner;
public class Employee {
    private String Name;
    private String City;
    private double BasicSalary;
    private double da;
    private double hra;
    private double TotalSal;

    void getdata(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Employee Name: ");
        Name=sc.nextLine();
        System.out.println("Enter City Of Residence: ");
        City=sc.nextLine();
        System.out.println("Enter Salary: ");
        BasicSalary=sc.nextDouble();
    }
    void calculate(){
        da = BasicSalary * 15.0/100;
        hra = BasicSalary * 10.0/100;
        
        TotalSal=BasicSalary+BasicSalary*da/100+BasicSalary*hra/100;
    }
    void display(){
        System.out.println("Employee Name: "+Name);
        System.out.println("Employee City Of Residence: "+City);
        System.out.println("Salary Of Employee: "+BasicSalary);
        System.out.println("Dearness Allowance:"+da);
        System.out.println("House Rent Allowance: "+hra);
        System.out.println("Total Salary: "+TotalSal);
    }
    public static void main(String[] args) {
        Employee obj=new Employee();
        obj.getdata();
        obj.calculate();
        obj.display();
    }

    
}
