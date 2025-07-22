package com.puretask.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.puretask.dao.EmployeeDao;
import com.puretask.exception.EmployeeNotFoundException;
import com.puretask.model.Employee;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao ed;

	@Override
	public Employee save(Employee e) {
		return ed.save(e);
	}

	@Override
	public List<Employee> findAll() {
		return ed.findAll();
	}

	@Override
	public Employee findById(int id) {
		Employee emp = ed.findById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Employee "+id+" does not exist ");
		}
		return emp;
	}

	@Override
	public int deleteById(int id) {
		Employee emp = ed.findById(id);
		if(emp == null) {
			throw new EmployeeNotFoundException("Employee "+id+" does not exist ");
		}
		return ed.deleteById(id);
	}

}
