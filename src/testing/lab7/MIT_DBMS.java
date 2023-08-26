package testing.lab7;

class Student_Detail {
    private String name;
    private int id;
    private static final String college_name = "MIT"; // College name is constant for all students

    public Student_Detail(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("College: " + college_name);
    }
}

public class MIT_DBMS {
    public static void main(String[] args) {
        // Creating instances of Student_Detail
        Student_Detail student1 = new Student_Detail("John Doe", 1001);
        Student_Detail student2 = new Student_Detail("Jane Smith", 2001);

        // Displaying details of students
        System.out.println("Student 1 Details:");
        student1.displayDetails();
        System.out.println();

        System.out.println("Student 2 Details:");
        student2.displayDetails();
    }
}

