package standard_code.inheritance;

class Vehicle {
    private String brand;
    private String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void startEngine() {
        System.out.println("Starting the engine of " + brand + " " + model);
    }

    public void stopEngine() {
        System.out.println("Stopping the engine of " + brand + " " + model);
    }

    protected void finalize() {
        System.out.println("Vehicle destroyed: " + brand + " " + model);
    }
}

class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String brand, String model, int numberOfDoors) {
        super(brand, model);
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void drive() {
        System.out.println("Driving the car: " + getBrand() + " " + getModel());
    }
}

public class VehicleExample {
    public static void main(String[] args) {
        Car car = new Car("Toyota", "Corolla", 4);
        car.startEngine();
        car.drive();
        car.stopEngine();
    }
}
