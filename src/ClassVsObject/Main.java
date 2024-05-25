package ClassVsObject;

public class Main {
    public static void main(String[] args) {
        // Create objects (instances) of the Car class
        Car volvo = new Car("Volvo", "Red");
        Car audi = new Car("Audi", "Black");
        Car toyota = new Car("Toyota", "White");

        // Display details and perform actions on the Volvo car
        volvo.displayDetails();
        volvo.moveForward();
        volvo.turn("left");

        // Display details and perform actions on the Audi car
        audi.displayDetails();
        audi.moveBackward();
        audi.turn("right");

        // Display details and perform actions on the Toyota car
        toyota.displayDetails();
        toyota.moveForward();
        toyota.turn("right");
    }
}