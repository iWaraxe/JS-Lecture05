package com.coherentsolutions.section1.example3;

// Interface with default method
public interface Walkable {
    default void walk() {
        System.out.println("Walking at a normal pace");
    }
}