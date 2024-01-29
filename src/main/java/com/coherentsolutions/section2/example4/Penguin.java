package com.coherentsolutions.section2.example4;

// Penguin class using composition instead of inheritance
public class Penguin {
    Bird bird;

    public Penguin() {
        bird = new Bird();
    }

    void swim() {
        System.out.println("Swimming...");
    }

    void makeSound() {
        bird.makeSound(); // Delegate the call
    }
}