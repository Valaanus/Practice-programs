package org.example.practice;
class Shape {
    String name;

    Shape(String name) {
        this.name = name;
    }

    void draw() {
        System.out.println("Drawing a " + name);
    }

    double calculateArea() {
        System.out.println("Calculating area of " + name);
        return 0.0;
    }
}

class Circle extends Shape {
    double radius;

    Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + name + " with radius " + radius);
    }

    @Override
    double calculateArea() {
        System.out.println("Calculating area of " + name);
        return Math.PI * Math.pow(radius, 2);
    }
}

class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    void draw() {
        System.out.println("Drawing a " + name + " with length " + length + " and width " + width);
    }

    @Override
    double calculateArea() {
        System.out.println("Calculating area of " + name);
        return length * width;
    }
}

public class InheritanceExample3 {
    public static void main(String[] args) {

        Circle myCircle = new Circle("Circle", 5.0);
        Rectangle myRectangle = new Rectangle("Rectangle", 4.0, 6.0);


        myCircle.draw();
        System.out.println("Area of " + myCircle.name + ": " + myCircle.calculateArea());


        myRectangle.draw();
        System.out.println("Area of " + myRectangle.name + ": " + myRectangle.calculateArea());
    }
}