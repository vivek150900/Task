package com.puretask.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.puretask.model.Employee;
import com.puretask.service.EmployeeService;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;

@RestController
@Validated
public class EmployeeContoller {
	
	@Autowired
	private EmployeeService es;

	@PostMapping(value = "/insertemp")
	public Employee insertEmplloyee(@Valid @RequestBody Employee e) {
		return es.save(e);
	}
	
	@GetMapping(value = "/findallemp")
	public List<Employee> findAllEmployee(){
		return es.findAll();	
	}
	
	@GetMapping(value = "/findempbyid/{id}")
	public Employee findEmployeeById(
			@PathVariable 
			@Min(value = 1, message = "ID must be >= 1") 
			int id) {
		return es.findById(id);
	}
	
	@PutMapping(value = "/updateemp")
	public Employee updateEmployee(@Valid @RequestBody Employee e){
		return es.save(e);
	}
	
	@DeleteMapping(value = "/deletebyid/{id}")
	public int deleteEmployeeById(
			@PathVariable 
			@Min(value = 1, message = "ID must be >= 1")
			int id) {
		return es.deleteById(id);
	}
}
