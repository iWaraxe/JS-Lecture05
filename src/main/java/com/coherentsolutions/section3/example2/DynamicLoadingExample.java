package com.coherentsolutions.section3.example2;

public class DynamicLoadingExample {
    public static void main(String[] args) {
        try {
            Class<?> dynamicClass = Class.forName("java.util.ArrayList");
            Object obj = dynamicClass.newInstance();
            System.out.println("Class loaded: " + dynamicClass.getName());
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
