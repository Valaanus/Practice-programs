package org.example.practice;

class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    void start() {
        System.out.println("Starting the " + brand + " vehicle.");
    }

    void stop() {
        System.out.println("Stopping the " + brand + " vehicle.");
    }
}
class Car extends Vehicle {
    Car(String brand) {
        super(brand);
    }

    void drive() {
        System.out.println("Driving the " + brand + " car.");
    }
}

public class InheritanceExample2 {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");
        myCar.start();
        myCar.stop();
        myCar.drive();
    }
}
