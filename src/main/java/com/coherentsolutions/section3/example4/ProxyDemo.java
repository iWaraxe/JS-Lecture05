package com.coherentsolutions.section3.example4;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// Define an interface that we'll implement with our proxy
interface MyInterface {
    void myMethod();
}

// Create an InvocationHandler implementation
class MyInvocationHandler implements InvocationHandler {
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) {
        System.out.println("Method invoked: " + method.getName());
        return null;
    }
}

// Main class to demonstrate dynamic proxy creation
public class ProxyDemo {
    public static void main(String[] args) {
        // Create a dynamic proxy instance
        MyInterface myInstance = (MyInterface) Proxy.newProxyInstance(
                MyInterface.class.getClassLoader(),
                new Class[] { MyInterface.class },
                new MyInvocationHandler()
        );

        // Invoke a method on the proxy instance
        myInstance.myMethod();  // Output: Method invoked: myMethod
    }
}
