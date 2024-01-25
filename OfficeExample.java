package org.example.practice;
abstract class Employee {
    String name;
    int employeeId;
    Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }
    abstract void work();

    // Concrete method
    void displayInfo() {
        System.out.println("Employee ID: " + employeeId);
        System.out.println("Name: " + name);
    }
}

// Concrete subclass
class Manager extends Employee {
    String department;

    Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    void work() {
        System.out.println(name + " is managing the " + department + " department.");
    }
}

// Concrete subclass
class Programmer extends Employee {
    String programmingLanguage;

    Programmer(String name, int employeeId, String programmingLanguage) {
        super(name, employeeId);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    void work() {
        System.out.println(name + " is programming in " + programmingLanguage + ".");
    }
}

public class OfficeExample {
    public static void main(String[] args) {
        Manager manager = new Manager("Anusha", 101, "IT");
        manager.displayInfo();
        manager.work();

        System.out.println();

        Programmer programmer = new Programmer("Likitha", 202, "Java");
        programmer.displayInfo();
        programmer.work();
    }
}
