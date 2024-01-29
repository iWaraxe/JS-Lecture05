package com.coherentsolutions.section2.example3;

// Interface Example
public interface LivingBeing {
    void breathe();

    default void live() {
        System.out.println("I am a living being");
    }
}
