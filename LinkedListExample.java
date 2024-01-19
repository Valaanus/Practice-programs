package org.example.practice;
import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Apple");
        linkedList.add("Banana");
        linkedList.add("Orange");
        linkedList.add("Grapes");
        System.out.println("Linked List elements: " + linkedList);
        linkedList.addFirst("Mango");
        linkedList.addLast("Pineapple");
        System.out.println("Updated Linked List: " + linkedList);
        linkedList.remove("Banana");
        System.out.println("Final Linked List: " + linkedList);
        System.out.println("Traversing Linked List:");
        for (String fruit : linkedList) {
            System.out.println(fruit);
        }
    }
}
