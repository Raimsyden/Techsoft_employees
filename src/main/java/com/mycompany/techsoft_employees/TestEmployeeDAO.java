/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.techsoft_employees;
import java.time.LocalDate;

/**
 *
 * @author santi
 */
public class TestEmployeeDAO {

    public static void main(String[] args) {

        EmployeeDAO dao = new EmployeeDAO();

        Employee emp = new Employee(
            123456,
            "Santiago",
            22,
            "Developer",
            3000000,
            "2026-02-11"
        );

        boolean guardado = dao.guardar(emp);

        if (guardado) {
            System.out.println("Empleado guardado correctamente");
        } else {
            System.out.println("Error al guardar");
        }
    }
}
