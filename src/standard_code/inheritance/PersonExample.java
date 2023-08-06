package standard_code.inheritance;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    protected void finalize() {
        System.out.println("Person destroyed: " + name);
    }
}

class Employee extends Person {
    private String employeeId;

    public Employee(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public void displayEmployeeInfo() {
        displayInfo();
        System.out.println("Employee ID: " + employeeId);
    }
}

public class PersonExample {
    public static void main(String[] args) {
        Employee employee = new Employee("John Doe", 30, "12345");
        employee.displayEmployeeInfo();
    }
}
