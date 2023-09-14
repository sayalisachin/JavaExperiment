class Bike {
    int speedlimit = 60;

    void run() {
        System.out.println("Bike's speed limit is " + speedlimit + " km/h");
    }
}

class Splendar extends Bike {
    int speedlimit = 80;

    @Override
    void run() {
        System.out.println("Splendar's speed limit is " + speedlimit + " km/h");
    }
}

public class MainBike {
    public static void main(String[] args) {
        Bike bike = new Bike();
        Bike splendar = new Splendar();

        bike.run();     // Calls the run() method of the Bike class
        splendar.run(); // Calls the overridden run() method of the Splendar class
    }
}
