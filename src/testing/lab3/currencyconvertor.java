/*Write a Java program to convert the given Indian currency into Dollars or Euros 
First parameter indicates the choice: 1 (to convert into Dollars), 2 (to
convert into Euros) and second parameter in the command line indicates the amount to be
converted. [Assume 1 Dollar =75 INR, 1 Euro =82 INR] */


package testing.lab3;
import java.util.Scanner;

public class currencyconvertor {
    private int rupee;
    private int amount;
    private int result;

    public currencyconvertor(int rupee){
        this.rupee=rupee;
    }
    public int getRupee(){
        return rupee;
    }
    public void setRupee(int rupee){
        this.rupee=rupee;
    }
    //method for converting rupees to dollars
    public static void main(String[] args) {
        
        int result;
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter amount in rupees: ");
        int amount=sc.nextInt();

        System.out.println("Enter conversion: (1. To Dollars)(2. To Euros)");
        int choice=sc.nextInt();
        switch(choice){
            case 1:
            result=(amount/75);
            System.out.println("Result after conversion: "+result);
            break;

            case 2:
            result=(amount/85);
            System.out.println("Result after conversion: "+result);
            break;

            default :
            System.out.println("Invalid input");

        }
        return;
    }

    
}




