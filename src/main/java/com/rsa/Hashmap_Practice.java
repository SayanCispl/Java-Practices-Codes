package com.rsa;

import java.util.HashMap;

public class Hashmap_Practice {
    public static void main(String[] args) {
        HashMap<String, Integer> hs = new HashMap<>();
        // Adding elements using add() method
        hs.put("sayan", 100);
        hs.put("test", 200);
        hs.put("Koles", 50);
        // Checking if a key is present and if
        // present, print value by passing
        // random element
        if (hs.containsKey("test")) {

            // Mapping
            Integer a = hs.get("test");

            // Printing value for the corresponding key
            System.out.println("value for key"
                    + " \"test\" is: " + a);

        }
    }
}