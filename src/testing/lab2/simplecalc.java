package testing.lab2;

import java.util.Scanner;

public class simplecalc {
    private int num1;
    private int num2;
    private int result;
    private char operat;

    public simplecalc(int num1, char operat, int num2){
        this.num1=num1;
        this.operat=operat;
        this.num2=num2;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1){
        this.num1 = num1;
    }
    public char getOperat(){
        return operat;
    }
    public void setOperat(char operat){
        this.operat=operat;
    }
    public int getNum2(){
        return num2;

    }
    public void setNum2(int num2){
        this.num2=num2;
    }

    public static void main(String[] args) {
        
        double result;
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter first number:");
        int num1=scanner.nextInt();
        System.out.println("Enter operator (+,-,*,/):");
        char operat=scanner.next().charAt(0);
        System.out.println("Enter second number");
        int num2=scanner.nextInt();
        

        switch(operat){
            case '+':
                result=num1+num2;
                break;

            case '-':
                result=num1-num2;
                break;

            case'*':
                result=num1*num2;
                break;

            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                    return;
                }
                break;

            default:
                System.out.println("Error: Invalid operator.");
                return;

        }
        System.out.println("Result: " + result);


        while (true){
            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String anotherCalculation = scanner.next();

            if (!anotherCalculation.equalsIgnoreCase("yes")) {
                break;
            }
            }
        System.out.println("Calculator closed.");

        scanner.close();
        
    }
}