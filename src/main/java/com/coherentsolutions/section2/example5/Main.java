package com.coherentsolutions.section2.example5;

// Interface defining the contract for payment processing
interface PaymentGateway {
    void processPayment(double amount);
}

// Class implementing PaymentGateway for Paypal
class Paypal implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Paypal");
        // Paypal-specific payment processing logic
    }
}

// Class implementing PaymentGateway for Stripe
class Stripe implements PaymentGateway {
    public void processPayment(double amount) {
        System.out.println("Processing payment of " + amount + " via Stripe");
        // Stripe-specific payment processing logic
    }
}

// Main class to run the example
public class Main {
    public static void main(String[] args) {
        PaymentGateway paypal = new Paypal();
        PaymentGateway stripe = new Stripe();

        paypal.processPayment(100.0);  // Outputs: "Processing payment of 100.0 via Paypal"
        stripe.processPayment(200.0);  // Outputs: "Processing payment of 200.0 via Stripe"
    }
}
