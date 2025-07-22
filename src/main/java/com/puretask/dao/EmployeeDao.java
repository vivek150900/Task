package com.puretask.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.puretask.model.Employee;

@Repository
public interface EmployeeDao extends JpaRepository<Employee, Integer>{

	Employee save(Employee e);
	List<Employee> findAll();
	Employee findById(int id);
	
	@Query(value = "delete from Employee where id = ?1 ", nativeQuery = true)
	@Modifying
	int deleteById(int id);
}
