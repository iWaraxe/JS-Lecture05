package com.coherentsolutions.section3.example3;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class PerformanceExample {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        long startTime, endTime;

        // Direct method invocation
        startTime = System.nanoTime();
        Math.abs(-10);
        endTime = System.nanoTime();
        System.out.println("Direct invocation time: " + (endTime - startTime) + " ns");

        // Reflective method invocation
        Method method = Math.class.getMethod("abs", int.class);
        startTime = System.nanoTime();
        method.invoke(null, -10);
        endTime = System.nanoTime();
        System.out.println("Reflective invocation time: " + (endTime - startTime) + " ns");
    }
}

