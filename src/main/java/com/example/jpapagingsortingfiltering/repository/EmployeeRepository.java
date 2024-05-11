package com.example.jpapagingsortingfiltering.repository;

import com.example.jpapagingsortingfiltering.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {
}
