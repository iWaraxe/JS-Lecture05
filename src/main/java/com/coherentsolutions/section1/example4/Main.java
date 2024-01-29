package com.coherentsolutions.section1.example4;

import java.util.Comparator;

// Defining a functional interface
@FunctionalInterface
interface Converter {
    int convert(String str);
}

public class Main {
    public static void main(String[] args) {
        // Using lambda expression
        Converter stringToInt = Integer::parseInt;

        // Using the lambda expression to convert a string to an integer
        int result = stringToInt.convert("123");
        System.out.println("Converted string to integer: " + result);
    }
}
