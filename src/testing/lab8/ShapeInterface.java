package testing.lab8;

// Interface for calculating area
interface AreaCalculatable {
    double calculateArea();
}

// Circle class implementing AreaCalculatable
class Circle implements AreaCalculatable {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

// Rectangle class implementing AreaCalculatable
class Rectangle implements AreaCalculatable {
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

public class ShapeInterface {
    public static void main(String[] args) {
        AreaCalculatable circle = new Circle(5.0);
        AreaCalculatable rectangle = new Rectangle(4.0, 6.0);

        double circleArea = circle.calculateArea();
        double rectangleArea = rectangle.calculateArea();

        System.out.println("Area of the Circle: " + circleArea);
        System.out.println("Area of the Rectangle: " + rectangleArea);
    }
}

