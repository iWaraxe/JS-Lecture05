package com.coherentsolutions.section2.example1;

// Main class for running the code example
public class Main {
    public static void main(String[] args) {
        // Cannot instantiate an abstract class
        // Animal animal = new Animal();  // Uncommenting this line will result in a compilation error

        // You can, however, use it as a type for polymorphism
        Animal myAnimal = new Dog();
        myAnimal.makeSound();  // Outputs: "Woof"
        myAnimal.sleep();  // Outputs: "This animal sleeps"
    }
}
