package com.spring.task.controller;
import com.spring.task.model.Employee;
import com.spring.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employees")
public class EmployeeController {
	@Autowired
    private EmployeeService service;

    @PostMapping("/add")
    public Employee addEmployee(@ModelAttribute Employee employee) {
        return service.saveEmployee(employee);
    }

    @GetMapping("/displayAll")
    public List<Employee> getAllEmployees() {
        return service.getAllEmployees();
    }

    
    @GetMapping("/display/{id}")
    public Employee getEmployeeById(@PathVariable String id) {
        return service.getEmployeeById(id);
    }
}

    

