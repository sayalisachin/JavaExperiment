//Leap year for a given user input year
package testing.lab2;
import java.util.Scanner;


public class leapyear {
    private int yr;
    private boolean result;

    public leapyear(int yr){
        this.yr = yr;
    }

    public getYr(){
        return yr;
    }
    public void setYr(int yr){
        this.yr=yr;
    }
    public static void main(String[] args) {
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Year");
        int yr=scanner.nextInt();
        if (yr%4 != 0){
            System.out.print(yr+ "is a common year");
        }else if(yr%100 != 0){
            System.out.print((yr)+" is a LeapYear");
        }else if(yr%400 != 400){
            System.out.println((yr)+"is a common year");
        }else{
            System.out.println(((yr)+ " is a LeapYear"));
        }



    }
    

        
}


