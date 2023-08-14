package java_prog_daily;
public class Vehicle {
    final void transportMode() {
        System.out.println("travels on land only");
    }
}

class Plane extends Vehicle {
    // Subclass remains completely empty
}

class Ship extends Vehicle {
    // Subclass remains completely empty
}

public class Main{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Plane plane = new Plane();
        Ship ship = new Ship();

        System.out.print("Vehicle: ");
        vehicle.transportMode();

        System.out.print("Plane: ");
        plane.transportMode();

        System.out.print("Ship: ");
        ship.transportMode();
    }
}
