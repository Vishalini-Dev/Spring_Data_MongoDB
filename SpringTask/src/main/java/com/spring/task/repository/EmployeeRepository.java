package com.spring.task.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.spring.task.model.Employee;

@Repository
public interface EmployeeRepository extends MongoRepository<Employee, String> {}
