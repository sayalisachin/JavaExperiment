package testing.lab10;
import java.util.Scanner;

public class StudentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter roll number: ");
        int rollNumber = scanner.nextInt();

        int[] marks = new int[3];
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter marks for subject " + (i + 1) + ": ");
            try {
                marks[i] = Integer.parseInt(scanner.next());
            } catch (NumberFormatException e) {
                System.out.println("Invalid input for marks. Please enter a valid integer.");
                scanner.close();
                return;
            }
        }

        scanner.close();

        double totalMarks = marks[0] + marks[1] + marks[2];
        double percentage = (totalMarks / (3 * 100)) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("Student's Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Percentage: " + percentage);
        System.out.println("Grade: " + grade);
    }
}

