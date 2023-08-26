package testing.lab10;

// Custom exception class MarkOutOfBoundsException
class MarkOutOfBoundsException extends Exception {
    public MarkOutOfBoundsException(String message) {
        super(message);
    }
}

// Student class
class Student {
    private String name;
    private int mark;

    public Student(String name, int mark) throws MarkOutOfBoundsException {
        this.name = name;
        if (mark > 100) {
            throw new MarkOutOfBoundsException("Mark is out of bounds (greater than 100)");
        }
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }
}

public class OOB {
    public static void main(String[] args) {
        try {
            Student student1 = new Student("John Doe", 85);
            Student student2 = new Student("Jane Smith", 110); // This will throw MarkOutOfBoundsException

            System.out.println(student1.getName() + "'s Mark: " + student1.getMark());
            System.out.println(student2.getName() + "'s Mark: " + student2.getMark());
        } catch (MarkOutOfBoundsException e) {
            System.out.println("Caught MarkOutOfBoundsException: " + e.getMessage());
        }
    }
}

