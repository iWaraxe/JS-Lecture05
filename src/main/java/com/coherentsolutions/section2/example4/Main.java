package com.coherentsolutions.section2.example4;

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        Penguin penguin = new Penguin();
        penguin.swim();       // Outputs: "Swimming..."
        penguin.makeSound();  // Outputs: "Chirp chirp" (delegated to Bird class)
    }
}
