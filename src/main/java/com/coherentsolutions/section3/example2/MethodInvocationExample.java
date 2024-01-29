package com.coherentsolutions.section3.example2;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

public class MethodInvocationExample {
    public static void main(String[] args) {
        Class<?> myClass = Math.class;
        Method method;
        try {
            method = myClass.getMethod("abs", int.class);
            Object result = method.invoke(null, -10);
            System.out.println("Result: " + result);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
