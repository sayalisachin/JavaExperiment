/*Write a Java program to convert the given Indian currency into Dollars or Euros 
First parameter indicates the choice: 1 (to convert into Dollars), 2 (to
convert into Euros) and second parameter in the command line indicates the amount to be
converted. [Assume 1 Dollar =75 INR, 1 Euro =82 INR] */


package testing.lab3;

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
        
        
        int amount=Integer.parseInt(args[0]);

        
        int choice=Integer.parseInt(args[1]);
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




