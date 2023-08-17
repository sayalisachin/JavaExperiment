package java_prog_daily;

import java.util.Scanner;

public class ExpressionCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value for 'a': ");
        int a = scanner.nextInt();
        
        System.out.print("Enter value for 'b': ");
        int b = scanner.nextInt();
        
        scanner.close();

        // Expression a: (a << 2) + (b >> 2)
        int resultA = (a << 2) + (b >> 2);
        System.out.println("Result of expression (a << 2) + (b >> 2): " + resultA);

        // Expression b: (b > 0)
        boolean resultB = (b > 0);
        System.out.println("Result of expression (b > 0): " + resultB);

        // Expression c: (a + b * 100) / 10
        int resultC = (a + b * 100) / 10;
        System.out.println("Result of expression (a + b * 100) / 10: " + resultC);

        // Expression d: a & b
        int resultD = a & b;
        System.out.println("Result of expression a & b: " + resultD);
    }
}

