package com.coherentsolutions.section3.example4;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Define a custom annotation
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String author();
    String date();
}

// Use the custom annotation in a class
@Info(author = "Igor", date = "01/10/2023")
class MyClass {
    // Class definition here
}

// Main class to demonstrate reflection and annotations
public class AnnotationDemo {
    public static void main(String[] args) {
        // Use reflection to access the annotation
        Class<MyClass> myClass = MyClass.class;

        if (myClass.isAnnotationPresent(Info.class)) {
            Info info = myClass.getAnnotation(Info.class);
            System.out.println("Author: " + info.author());
            System.out.println("Date: " + info.date());
        } else {
            System.out.println("No annotation");
        }
    }
}
