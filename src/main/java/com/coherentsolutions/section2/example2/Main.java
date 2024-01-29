package com.coherentsolutions.section2.example2;

// Abstract class with key features
abstract class Vehicle {
    String type;

    // Abstract method
    abstract void start();

    // Concrete method
    void stop() {
        System.out.println("Vehicle stopped");
    }

    // Constructor
    Vehicle(String type) {
        this.type = type;
    }
}

// Main class for running the code example
public class Main {
    public static void main(String[] args) {
        // Instantiate a Car object
        Car myCar = new Car();

        // Call methods
        myCar.start();  // Outputs: "Car started"
        myCar.stop();  // Outputs: "Vehicle stopped"
    }
}

// Concrete subclass extending the abstract class
class Car extends Vehicle {
    // Constructor
    Car() {
        super("Four-Wheeler");
    }

    // Implementing abstract method
    void start() {
        System.out.println("Car started");
    }
}
