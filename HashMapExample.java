package org.example.practice;
import java.util.HashMap;
import java.util.Map;
public class HashMapExample {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "Java");
        hashMap.put(2, "Python");
        hashMap.put(3, "C++");
        hashMap.put(4, "JavaScript");
        System.out.println("HashMap elements: " + hashMap);
        int keyToAccess = 2;
        if (hashMap.containsKey(keyToAccess)) {
            String value = hashMap.get(keyToAccess);
            System.out.println("Value associated with key " + keyToAccess + ": " + value);
        } else {
            System.out.println("Key " + keyToAccess + " not found in the HashMap.");
        }
        int keyToRemove = 3;
        if (hashMap.containsKey(keyToRemove)) {
            String removedValue = hashMap.remove(keyToRemove);
            System.out.println("Removed key " + keyToRemove + " with value: " + removedValue);
        } else {
            System.out.println("Key " + keyToRemove + " not found in the HashMap.");
        }
        System.out.println("Updated HashMap: " + hashMap);
        System.out.println("Iterating over HashMap:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}

