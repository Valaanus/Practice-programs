package org.example.practice;
class Animal {
    String name;
    Animal(String name) {
        this.name = name;
    }
    void eat() {
        System.out.println(name + " is eating.");
    }

    void sleep() {
        System.out.println(name + " is sleeping.");
    }
}
class Dog extends Animal {
    Dog(String name) {
        super(name);
    }
    void bark() {
        System.out.println(name + " is barking.");
    }
}
public class InheritanceExample {
    public static void main(String[] args) {
        Dog myDog = new Dog("snoopy");
        myDog.eat();
        myDog.sleep();
        myDog.bark();
    }
}
