package standard_code_practise;
import java.util.Scanner;

public class Butter {
    private int number1;
    private int number2;

    public Butter(int number1, int number2){
        this.number1=number1;
        this.number2=number2;

    }
    public int getNumber1(){
        return number1;
    }
    public void setNumber1(int getNumber1){
        this.number1=number1;
    }
    public int getNumber2(){
        return  number2 ;
    }
    public void setNumber2(int getNumber2){
        this.number2=number2;
    }
    public int addNumbers(){
        return number1+number2;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int number1=sc.nextInt();
        System.out.println("Enter second number ");
        int number2=sc.nextInt();

        Butter addition=new Butter(number1,number2);
        int sum=addition.addNumbers();
        System.out.println("The sum of "+number1+" and "+number2+"is"+sum);
        sc.close();


    }
}
