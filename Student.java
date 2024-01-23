package org.example.practice;
public class Student {
    private String name;
    private int age;
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void displayStudentInfo() {
        System.out.println("Student Name: " + this.name);
        System.out.println("Student Age: " + this.age);
    }
    public void setStudentInfo(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        System.out.println("Initial Student Information:");
        student1.displayStudentInfo();
        student1.setStudentInfo("likki", 22);
        System.out.println("\nUpdated Student Information:");
        student1.displayStudentInfo();
    }
}
