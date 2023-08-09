/*Create an employee class(id,name,deptname,salary). Define a default and

parameterized constructor. Use this keyword to initialize instance variables.

Keep a count of objects created. Create objects using parameterized constructor

and display the object count after each object is created.(Use static member and

method). Also display the contents of each object. */
package java_prog_daily;
import java.util.Scanner;

public class EmployPractise {
    static int id;
    String name;
    String departname;
    double salary;
    public static int numberofobj=0;
    //create basic( default) employee parameter constructor
    EmployPractise(){
        id=0;
        name=" ";
        departname=" ";
        salary=0;

    }
    //this methpd
    EmployPractise(int id, String name,String departname,double salary){
        this.id=id;
        this.name=name;
        this.departname=departname;
        this.salary=salary;
    }
    //displaying object count hereon
    public void display(){
        System.out.println("Employee ID: "+id);
        System.out.println("Employee name: "+name);
        System.out.println("Department of Employee: "+departname);
        System.out.println("Salary of Employee: "+salary);
    }
    //main method
    public static void main(String[] args) {
        
        int n=0;
        Scanner sc = new Scanner (System.in );
        System.out.println("Number of employees to enter: ");
        n=sc.nextInt();
        EmployPractise[] ob=new EmployPractise[n];
        
        //object count parameterised
        for (int i=0;i<n;i++){
            sc=new Scanner(System.in);
            System.out.println("Enter Employee ID"+(i+1)+" ");
            sc.nextLine();
            System.out.println("Enter name of employee"+(i+1)+" ");
            String name=sc.nextLine();

            System.out.println("Enter department of employee"+(i+1)+" ");
            String departname=sc.nextLine();

            System.out.println("Enter salary of employee"+(i+1)+" ");
            double salary=sc.nextDouble();

            //new object everytime we enter a new employee
            ob[i]=new EmployPractise(i, name, departname, salary);
            
            System.out.println("\nNumber of objects entered: "+numberofobj);


        }
        //repeat object sequence, so everytime a new object is created
        for(int i=0;i<n;i++){
            ob[i].display();
        }


    }

    




    
}
