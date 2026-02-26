/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.techsoft_employees;


import com.mycompany.techsoft_employees.Conection.DatabaseConnection;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDAO {

// Insert 
    public boolean guardar(Employee employee) {

        String sql = "INSERT INTO employee (idDocument, name, age, role, salary, startDate) "
                   + "VALUES (?, ?, ?, ?, ?, ?)";   

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

                pstmt.setInt(1, employee.getIdDocument());
                pstmt.setString(2, employee.getName());
                pstmt.setInt(3, employee.getAge());
                pstmt.setString(4, employee.getRole());
                pstmt.setDouble(5, employee.getSalary());
                pstmt.setString(6, employee.getStartDate());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

// Buscar idEmployee
    public Employee buscarPorId(int id) {

        String sql = "SELECT * FROM employee WHERE idEmployee = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                return mapearEmpleado(rs);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

// Ver toda la tabla
    public List<Employee> listarTodos() {

        List<Employee> lista = new ArrayList<>();
        String sql = "SELECT * FROM employee";

        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                lista.add(mapearEmpleado(rs));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return lista;
    }

// Actualizar empleados
    public boolean actualizar(Employee employee) {

        String sql = "UPDATE employee SET idDocument = ?, name = ?, age = ?, role = ?, "
                   + "salary = ?, startDate = ? WHERE idEmployee = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, employee.getIdDocument());
            pstmt.setString(2, employee.getName());
            pstmt.setInt(3, employee.getAge());
            pstmt.setString(4, employee.getRole());
            pstmt.setDouble(5, employee.getSalary());
            pstmt.setDate(6, Date.valueOf(employee.getStartDate()));
            pstmt.setInt(7, employee.getIdEmployee());

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

// Eliminar empleado
    public boolean eliminar(int id) {

        String sql = "DELETE FROM employee WHERE idEmployee = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {

            pstmt.setInt(1, id);

            int rowsAffected = pstmt.executeUpdate();
            return rowsAffected > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

// Método para mapear
    private Employee mapearEmpleado(ResultSet rs) throws SQLException {

        return new Employee(
                rs.getInt("idEmployee"),
                rs.getInt("idDocument"),
                rs.getString("name"),
                rs.getInt("age"),
                rs.getString("role"),
                rs.getDouble("salary"),
                rs.getString("startDate")
        );
    }
}
