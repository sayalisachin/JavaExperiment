package standard_code.inheritance;

abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();

    public void display() {
        System.out.println("Color: " + color);
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(String color, double length, double width) {
        super(color);
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class ShapeExample {
    public static void main(String[] args) {
        Circle circle = new Circle("Red", 3.5);
        circle.display();
        System.out.println("Area: " + circle.calculateArea());

        Rectangle rectangle = new Rectangle("Blue", 4.2, 5.7);
        rectangle.display();
        System.out.println("Area: " + rectangle.calculateArea());
    }
}
