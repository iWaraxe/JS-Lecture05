package com.coherentsolutions.section3.example3;

import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class PrivateMethodExample {

    public static void main(String[] args) {
        SecretClass example = new SecretClass();

        //example.showSecret();

        try {
            // Get the class object
            Class<?> clazz = example.getClass();

            Method[] declaredMethods = clazz.getDeclaredMethods();
            System.out.println(Arrays.toString(declaredMethods));

            // Get the private method 'showSecret'
            Method method = clazz.getDeclaredMethod("showSecret");
            // method.invoke(example);

            // Make the private method accessible
            method.setAccessible(true);

            // Invoke the private method
            method.invoke(example);
        } catch (NoSuchMethodException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

