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
    private String StartDate;
    
    public Employee(int idEmployee, int idDocument, String name, int age, String role, double salary, String StartDate){
        
        this.idEmployee =  idEmployee;
        this.idDocument = idDocument;
        this.name = name;
        this.age = age;
        this.role = role;
        this.salary = salary;
        this.StartDate = StartDate;
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
        return StartDate;
    }

    public void setStartDate(String StartDate) {
        this.StartDate = StartDate;
    }
    
    public String showBasicInfo() {
        return "Name:" + getName()+
                "Document:" + getIdDocument()+
                "Age:"+ getAge();
    }
    
    public String showInfo(){
        return "Name:" + getName()+
                "Document:" + getIdDocument()+
                "idEmployee:" + getIdEmployee()+
                "Salary:"+ getSalary()+
                "Role:" + getRole()+
                "Startdate:" + getStartDate();
    }
    
}
