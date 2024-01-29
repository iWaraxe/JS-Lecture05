package com.coherentsolutions.section3.example1;

import java.lang.reflect.Method;

public class ReflectionExample {
    public static void main(String[] args) {
        // Get the Class object associated with the String class
        Class<?> myClass = String.class;

        // Fetch all public methods of the String class
        Method[] methods = myClass.getMethods();

        // Loop through methods and print their names
        for (Method method : methods) {
            System.out.println("Method name: " + method.getName());
        }
    }
}
