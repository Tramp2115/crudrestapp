package com.tramp.crudrestapp.service;

import com.tramp.crudrestapp.dao.EmployeeDAO;
import com.tramp.crudrestapp.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeDAO employeeDAO;

    @Autowired
    public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        return employeeDAO.findAll();
    }

    @Override
    @Transactional
    public Employee findById(int id) {
        return employeeDAO.findById(id);
    }

    @Override
    @Transactional
    public Employee save(Employee employee) {
        employeeDAO.save(employee);
        return employee;
    }
    @Override
    @Transactional
    public void deleteById(int id) {
        employeeDAO.deleteById(id);
    }
}
