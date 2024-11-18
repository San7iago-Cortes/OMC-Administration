package com.example.poo.model;

public class Employee extends Person {
    private int employeeId;
    private int phoneNumber;
    private String role;

    public Employee(int employeeId, String name, int phoneNumber, String role, String email) {
        super(name, email);
        this.employeeId = employeeId;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public void receiveOrder(Order order) {
        System.out.println(this.getName() + " has received a new order with ID: " + order.getOrderId());
    }

    public void updateEmployeeRole(String newRole) {
        this.role = newRole;
        System.out.println("The role of " + this.getName() + " has updated to " + this.role);
    }
}