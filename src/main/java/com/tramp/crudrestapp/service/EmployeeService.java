package com.tramp.crudrestapp.service;

import com.tramp.crudrestapp.entity.Employee;

import java.util.List;

public interface EmployeeService {
    public List<Employee> findAll();
    public Employee findById(int id);
    public Employee save(Employee employee);
    public void deleteById(int id);
}
