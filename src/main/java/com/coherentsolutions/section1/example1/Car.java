package com.coherentsolutions.section1.example1;

import com.coherentsolutions.introduction.Animal;
import com.coherentsolutions.section2.example1.Dog;

// Implementing an interface
public class Car implements Drivable {
    public void startEngine() {
        System.out.println("Engine started");
    }

    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    public void accelerate() {
        System.out.println("Accelerating...");
    }
}