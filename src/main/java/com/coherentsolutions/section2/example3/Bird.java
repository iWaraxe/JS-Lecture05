package com.coherentsolutions.section2.example3;

// Abstract class with different access modifiers and final methods
public abstract class Bird {
    public abstract void sing();

    public final void layEgg() {
        System.out.println("Egg laid");
    }
}

