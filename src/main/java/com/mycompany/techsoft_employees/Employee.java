/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techsoft_employees;

/**
 *
 * @author santi
 */

public class Employee {

    private int idEmployee; 
    private int idDocument; 
    private String name;
    private int age;
    private String role;
    private double salary;
    private String startDate;

    // Constructor SIN id (para insertar en BD)
    public Employee(int idDocument, String name, int age, String role, double salary, String startDate) {
        this.idDocument = idDocument;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.startDate = startDate;
    }

    // Constructor CON id (para cuando lees desde BD)
    public Employee(int idEmployee, int idDocument, String name, int age, String role, double salary, String startDate) {
        this.idEmployee = idEmployee;
        this.idDocument = idDocument;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.startDate = startDate;
    }

    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public int getIdDocument() {
        return idDocument;
    }

    public void setIdDocument(int idDocument) {
        this.idDocument = idDocument;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String showBasicInfo() {
        return "Name: " + name + "\n" +
               "Document: " + idDocument + "\n" +
               "Age: " + age;
    }

    public String showInfo() {
        return "Employee ID: " + idEmployee + "\n" +
               "Name: " + name + "\n" +
               "Document: " + idDocument + "\n" +
               "Age: " + age + "\n" +
               "Role: " + role + "\n" +
               "Salary: $" + salary + "\n" +
               "Start Date: " + startDate;
    }
}

