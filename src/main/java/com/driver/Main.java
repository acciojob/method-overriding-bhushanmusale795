package com.driver;

/// Define the superclass A
class A {
    // Method meth that returns a String
    public String meth() {
        return "Invoking method from class A";
    }
}

// Define the subclass B which extends A
class B extends A {
    // Override the meth method from class A
    @Override
    public String meth() {
        return "Method is overridden in Extended class B";
    }
}

// Main class to test the functionality
public class Main {
    public static void main(String[] args) {
        // Create an instance of class B
        B objB = new B();

        // Call the overridden meth method from class B
        String resultB = objB.meth();
        System.out.println(resultB);  // Output: "Method is overridden in Extended class B"

        // You can also call the meth method from class A through objB
        String resultA = ((A)objB).meth();
        System.out.println(resultA);  // Output: "Method is overridden in Extended class B" because objB is of class B
    }
}
