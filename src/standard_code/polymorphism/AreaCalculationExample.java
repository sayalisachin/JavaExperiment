package standard_code.polymorphism;

abstract class Shape {
    public abstract double calculateArea();
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }
}

public class AreaCalculationExample {
    public static void main(String[] args) {
        Shape circle = new Circle(3.5);
        System.out.println("Circle Area: " + circle.calculateArea());

        Shape rectangle = new Rectangle(4.2, 5.7);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
    }
}

