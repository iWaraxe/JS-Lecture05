package com.coherentsolutions.section1.example2;

// Declaring interfaces
interface Eatable {
    void eat();
}

interface Readable {
    void read();
}

// Implementing multiple interfaces
public class Human implements Eatable, Readable {
    @Override
    public void eat() {
        System.out.println("Eating food");
    }

    @Override
    public void read() {
        System.out.println("Reading a book");
    }
}
