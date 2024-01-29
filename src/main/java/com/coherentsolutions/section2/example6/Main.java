package com.coherentsolutions.section2.example6;

// Abstract class with shared implementation
abstract class AbstractRepository {
    void connect() {
        System.out.println("Common code for database connection");
    }

    abstract void save(Object obj);
}

// Concrete class extending the abstract class
class UserRepository extends AbstractRepository {
    void save(Object user) {
        System.out.println("User-specific save logic");
    }
}

// Another concrete class extending the abstract class
class OrderRepository extends AbstractRepository {
    void save(Object order) {
        System.out.println("Order-specific save logic");
    }
}

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        AbstractRepository userRepo = new UserRepository();
        AbstractRepository orderRepo = new OrderRepository();

        userRepo.connect();  // Outputs: "Common code for database connection"
        userRepo.save(new Object());  // Outputs: "User-specific save logic"

        orderRepo.connect();  // Outputs: "Common code for database connection"
        orderRepo.save(new Object());  // Outputs: "Order-specific save logic"
    }
}
