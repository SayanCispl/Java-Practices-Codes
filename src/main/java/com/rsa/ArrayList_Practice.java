package com.rsa;

import java.util.ArrayList;

public class ArrayList_Practice {
    public static void main(String[] args) {
        // Arraylist
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(50);
        numbers.add(100);
        numbers.add(-100);

        // Print the ArrayList
        System.out.println("Numbers in the ArrayList: " + numbers);
        // Access an element from the ArrayList
        System.out.println("Element at index 1: " + numbers.get(1));
        // Remove an element from the ArrayList
        numbers.remove(1);
        System.out.println("Numbers after removal: " + numbers);
        // Get the size of the ArrayList
        System.out.println("Size of the ArrayList: " + numbers.size());
        System.out.println(numbers.reversed());
        

    }
}
