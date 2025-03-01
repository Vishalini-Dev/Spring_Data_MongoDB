package com.spring.task.service;


import com.spring.task.model.Employee;
import com.spring.task.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {
    @Autowired
    private EmployeeRepository repository;
    
    public Employee saveEmployee(Employee employee) {
        return repository.save(employee);
    }
    
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }
    
    public Employee getEmployeeById(String id) {
        return repository.findById(id).orElse(null);
    }
}

