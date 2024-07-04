package com.driver;


// Define the superclass A

// Main class to test the functionality
public class Main {
   static class A {
        // Method meth that returns a String
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Define the subclass B which extends A
   static class B extends A {
        // Override the meth method from class A
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }
    public static void main(String[] args) {
        // Create an object of subclass B
        B objB = new B();

        // Call the overridden meth method from class B
//        String resultB = objB.meth();
//        System.out.println(resultB);  // Output: "Method is overridden in Extended class B"

        // Call the meth method from class A using objB
        String resultA = objB.meth();  // Calls overridden method in B
        System.out.println(resultA);
        // Output: "Method is overridden in Extended class B"
    }

}
