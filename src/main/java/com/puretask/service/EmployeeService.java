package com.puretask.service;

import java.util.List;

import com.puretask.model.Employee;

public interface EmployeeService {
	
	Employee save(Employee e);
	List<Employee> findAll();
	Employee findById(int id);
	int deleteById(int id);
}
