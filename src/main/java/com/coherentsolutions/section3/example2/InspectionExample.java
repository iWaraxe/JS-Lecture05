package com.coherentsolutions.section3.example2;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class InspectionExample {
    public static void main(String[] args) {
        Class<?> clazz = String.class;

        // Inspecting Fields
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println("Field: " + field.getName());
        }

        // Inspecting Methods
        Method[] methods = clazz.getDeclaredMethods();
        for (Method method : methods) {
            System.out.println("Method: " + method.getName());
        }
    }
}
