package com.basic.guids.services;

import java.util.List;

import com.basic.guids.model.Employee;



public interface EmployeeService {
Employee saveEmployee(Employee employee);
List<Employee> getAllEmployee();
Employee getEmployeeById(long id);
Employee updateEmployee(Employee employee,long id);
void deleteEmployee(long id);
}
