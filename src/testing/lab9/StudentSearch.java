import java.util.Scanner;

class Student {
    private int registrationNumber;
    private String firstName;
    private String lastName;
    private String degree;

    public Student(int registrationNumber, String firstName, String lastName, String degree) {
        this.registrationNumber = registrationNumber;
        this.firstName = firstName;
        this.lastName = lastName;
        this.degree = degree;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Degree: " + degree);
        System.out.println();
    }
}

public class StudentSearch {
    public static void main(String[] args) {
        Student[] students = new Student[10];

        // Initialize student data
        students[0] = new Student(101, "John", "Doe", "Computer Science");
        students[1] = new Student(102, "Alice", "Smith", "Electrical Engineering");
        students[2] = new Student(103, "Bob", "Johnson", "Mechanical Engineering");
        students[3] = new Student(104, "Eva", "Williams", "Chemistry");
        students[4] = new Student(105, "David", "Brown", "Physics");
        students[5] = new Student(106, "Sarah", "Jones", "Mathematics");
        students[6] = new Student(107, "Michael", "Lee", "Computer Science");
        students[7] = new Student(108, "Emily", "Davis", "Economics");
        students[8] = new Student(109, "Daniel", "Wilson", "Biology");
        students[9] = new Student(110, "Olivia", "Anderson", "History");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the First Name or Last Name to search for a student: ");
        String searchName = scanner.nextLine();

        boolean found = false;
        for (Student student : students) {
            if (student.getFirstName().equalsIgnoreCase(searchName) || student.getLastName().equalsIgnoreCase(searchName)) {
                student.displayDetails();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Student with the name '" + searchName + "' not found.");
        }

        scanner.close();
    }
}

