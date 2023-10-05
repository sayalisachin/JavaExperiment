// Define the Shape interface
interface Shape {
    double calculateArea();
}

// Create a Rectangle class implementing the Shape interface
class Rectangle implements Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

// Create a Circle class implementing the Shape interface
class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Create a Square class implementing the Shape interface
class Square implements Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side * side;
    }
}

// Create a Triangle class implementing the Shape interface
class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        return 0.5 * base * height;
    }
}

public class ShapeInterface {
    public static void main(String[] args) {
        // Create instances of different shapes
        Rectangle rectangle = new Rectangle(5.0, 3.0);
        Circle circle = new Circle(4.0);
        Square square = new Square(6.0);
        Triangle triangle = new Triangle(4.0, 5.0);

        // Calculate and display the areas
        System.out.println("Area of Rectangle: " + rectangle.calculateArea());
        System.out.println("Area of Circle: " + circle.calculateArea());
        System.out.println("Area of Square: " + square.calculateArea());
        System.out.println("Area of Triangle: " + triangle.calculateArea());
    }
}
