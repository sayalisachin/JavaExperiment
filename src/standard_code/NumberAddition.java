package standard_code;
import java.util.Scanner;

public class NumberAddition {
    private int number1;
    private int number2;

    // Constructor
    public NumberAddition(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    // Getters and Setters
    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    // Method to add two numbers
    public int addNumbers() {
        return number1 + number2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input first number
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        // Input second number
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Create NumberAddition object
        NumberAddition addition = new NumberAddition(num1, num2);

        // Perform addition and display the result
        int sum = addition.addNumbers();
        System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

        scanner.close();
    }
}
