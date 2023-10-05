// Abstract class Shape
abstract class Shape {
    abstract double calculateArea(); // Abstract method to calculate area
}

// Circle class extending Shape
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class extending Shape
class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double calculateArea() {
        return 0.5*base*height;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        return side*side;
    }
}

public class ShapeArea {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Rectangle rectangle = new Rectangle(4.0, 6.0);
        Triangle triangle = new Triangle(5.0, 4.0);
        Square square = new Square(2.0);

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();
        double triangleArea = triangle.calculateArea();
        double squareArea = square.calculateArea();

        System.out.println("Area of the Circle: " + circleArea);
        System.out.println("Area of the Rectangle: " + rectangleArea);
        System.out.println("Area of the Triangle: " + triangleArea);
        System.out.println("Area of the Square: " + squareArea);
    }
}