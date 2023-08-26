package testing.lab5;

class Box {
    private double width;
    private double depth;
    private double height;

    // Parameterized constructor to initialize dimensions
    public Box(double width, double depth, double height) {
        this.width = width;
        this.depth = depth;
        this.height = height;
    }

    // Method to calculate and return volume
    public double calculateVolume() {
        return (this.width * this.depth * this.height);
    }
}

public class MainBox {
    public static void main(String[] args) {
        // Creating an object of Box class with dimensions
        Box myBox = new Box(3.0, 4.0, 5.0);

        // Calculating and printing the volume of the box
        double volume = myBox.calculateVolume();
        System.out.println("Volume of the box: " + volume);
    }
}
