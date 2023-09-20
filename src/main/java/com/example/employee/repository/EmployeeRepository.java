// Write your code here
package com.example.employee.repository;

import java.util.*;
<<<<<<< HEAD
import com.example.employee.model.Employee;

public interface EmployeeRepository {
    public ArrayList<Employee> getEmployees();
    public Employee getEmployeeById(int employeeId);
    public Employee addEmployee(Employee employee);
    public Employee updateEmployee(int employeeId, Employee employee);
    public void deleteEmployee(int employeeId);
=======

import com.example.employee.model.Employee;

public interface EmployeeRepository {

    ArrayList<Employee> getEmployees();

    Employee getEmployeeById(int employeeId);

    Employee addEmployee(Employee employee);

    Employee updateEmployee(int employeeId, Employee employee);

    void deleteEmployee(int employeeId);
>>>>>>> commited 2
}