//Area and perimeter of rectangle
package testing.lab1;
import java.util.Scanner;

public class area {
    private double length;
    private double breadth;
    private double ar;
    private double perimeter;

    public area(double length,double breadth){
        this.length=length;
        this.breadth=breadth;
    }

    public double getLength(){
        return length;
    }

    public void  setLength(double length){
        this.length=length;
    }

    public double getBreadth(){
        return breadth;
    }

    public void setBreadth(double breadth){
        this.breadth=breadth;
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter desried length");
        double length=scanner.nextDouble();
        System.out.println("Enter desired breadth");
        double breadth=scanner.nextDouble();
        scanner.close();
        area Area=new area(length,breadth);

        double arr=Area.length*Area.breadth;
        

        double perimeter=2*(Area.length+Area.breadth);

        
        
        

        System.out.println("Area of rectangle is"+arr);
        System.out.println("Perimeter of the rectangle is"+perimeter);




    }

}


    

