package com.gmail.zernetcsgo.hw12;

public class Company {
    public static void main(String[] args) {
        Employee employee = new Employee(
                "John Doe",
                "Software Engineer",
                "johndoe@example.com",
                "+1-555-123-4567",
                30
        );

        System.out.println("=== Employee Information ===");
        System.out.println("Full Name: " + employee.getFullName());
        System.out.println("Position: " + employee.getPosition());
        System.out.println("Email: " + employee.getEmail());
        System.out.println("Phone: " + employee.getPhone());
        System.out.println("Age: " + employee.getAge());
        System.out.println("\n=== Starting the Car ===");
        Car myCar = new Car();
        myCar.start();
    }
}
