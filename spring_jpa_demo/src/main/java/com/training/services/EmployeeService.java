package com.training.services;

import com.training.entities.Employee;

import java.util.List;

public interface EmployeeService {

    //this service will be used by controller

    public Employee addEmployee(Employee e);

    public Employee updateEmployee(Long id  , Employee e);

    public List<Employee> listAllEmployees();

    public Employee findEmployeeById(Long id);

}
