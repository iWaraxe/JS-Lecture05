package com.coherentsolutions.section2.example3;

public class Main {
    public static void main(String[] args) {
        // Implementing Mammal abstract class
        Mammal mammal = new Mammal() {
            @Override
            public void breathe() {
                System.out.println("Breathing...");
            }
        };
        mammal.breathe();  // Outputs: "Breathing..."
        mammal.live();     // Outputs: "I am a living mammal"

        // Implementing LivingBeing interface
        LivingBeing being = new LivingBeing() {
            @Override
            public void breathe() {
                System.out.println("Breathing...");
            }
        };
        being.breathe();  // Outputs: "Breathing..."
        being.live();     // Outputs: "I am a living being"

        // Implementing Bird and FlyingCreature
        Bird bird = new Bird() {
            @Override
            public void sing() {
                System.out.println("Singing...");
            }
        };
        bird.sing();     // Outputs: "Singing..."
        bird.layEgg();   // Outputs: "Egg laid"

        FlyingCreature creature = new FlyingCreature() {
            @Override
            public void fly() {
                System.out.println("Flying...");
            }
        };
        creature.fly();  // Outputs: "Flying..."
    }
}
