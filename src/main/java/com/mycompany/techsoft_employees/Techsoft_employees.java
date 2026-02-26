/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.techsoft_employees;

/**
 *
 * @author santi
 */

import java.util.ArrayList;

public class Techsoft_Employees {

    private String companyName;
    private ArrayList<Employee> employeeList;

    // Constructor
    public Techsoft_Employees(String companyName) {
        this.companyName = companyName;
        this.employeeList = new ArrayList<>();
    }

    // Getter del nombre de la empresa
    public String getCompanyName() {
        return companyName;
    }

    // Registrar empleado
    public void registerEmployee(Employee employee) {
        employeeList.add(employee);
    }

    // Buscar empleado por ID
    public Employee findEmployeeById(int id) {
        for (Employee e : employeeList) {
            if (e.getIdEmployee() == id) {
                return e;
            }
        }
        return null; // Si no lo encuentra
    }

    // Buscar empleado por documento
    public Employee findEmployeeByDocument(int document) {
        for (Employee e : employeeList) {
            if (e.getIdDocument() == (document)) {
                return e;
            }
        }
        return null;
    }

    // Obtener lista completa
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    // Total de empleados registrados
    public int getTotalEmployees() {
        return employeeList.size();
    }
}

