package testing.lab6;

// Base class: Student
class Student {
    protected int registrationNumber;
    protected String name;
    protected int age;

    public Student(int registrationNumber, String name, int age) {
        this.registrationNumber = registrationNumber;
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

// Derived class: UGStudent
class UGStudent extends Student {
    private int semester;
    private double fees;

    public UGStudent(int registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayUGInfo() {
        displayInfo();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

// Derived class: PGStudent
class PGStudent extends Student {
    private int semester;
    private double fees;

    public PGStudent(int registrationNumber, String name, int age, int semester, double fees) {
        super(registrationNumber, name, age);
        this.semester = semester;
        this.fees = fees;
    }

    public void displayPGInfo() {
        displayInfo();
        System.out.println("Semester: " + semester);
        System.out.println("Fees: " + fees);
    }
}

// Main class
public class College {
    public static void main(String[] args) {
        UGStudent ugStudent = new UGStudent(1001, "John Doe", 20, 3, 5000.0);
        PGStudent pgStudent = new PGStudent(2001, "Jane Smith", 25, 2, 8000.0);

        System.out.println("UG Student Information:");
        ugStudent.displayUGInfo();
        System.out.println();

        System.out.println("PG Student Information:");
        pgStudent.displayPGInfo();
    }
}
