package ClassVsObject;

// Define the ClassVsObject.Car class
class Car {
    // Attributes (characteristics) of the ClassVsObject.Car class
    String brand;
    String color;

    // Constructor to initialize the ClassVsObject.Car object
    Car(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    // Methods (actions) that the ClassVsObject.Car class can perform
    void moveForward() {
        System.out.println(brand + " is moving forward.");
    }

    void moveBackward() {
        System.out.println(brand + " is moving backward.");
    }

    void turn(String direction) {
        System.out.println(brand + " is turning " + direction + ".");
    }

    // Method to display the car's details
    void displayDetails() {
        System.out.println("ClassVsObject.Car Brand: " + brand);
        System.out.println("ClassVsObject.Car Color: " + color);
    }
}

// ClassVsObject.Main class to test the ClassVsObject.Car class

