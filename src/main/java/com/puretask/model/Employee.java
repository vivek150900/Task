package com.puretask.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	
	@NotBlank(message = "Name is  requied")
	@Size(max = 100, message = "Name must be at most 100 charecters")
	String name;
	
	@NotBlank(message = "Email is  requied")
	@Email(message = "Email must be valid")
	@Size(max = 150, message = "Email must be at most 150 charecters")
	String email;
	
	@NotBlank(message = "Job Title is  requied")
	@Size(max = 100, message = "Job Title must be at most 100 charecters")
	String jobtitle;
	
	@NotBlank(message = "Department is  requied")
	@Size(max = 100, message = "Department must be at most 100 charecters")
	String department;
	
	@NotNull(message = "Salary is required.")
    @DecimalMin(value = "0.0", inclusive = true, message = "Salary must be >= 0.")
    @Digits(integer = 8, fraction = 2, message = "Salary must be a valid amount with up to 8 digit")
	@Column(columnDefinition = "numeric(10,2)")
	BigDecimal salary;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getJobtitle() {
		return jobtitle;
	}
	public void setJobtitle(String jobtitle) {
		this.jobtitle = jobtitle;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", jobtitle=" + jobtitle + ", department="
				+ department + ", salary=" + salary + "]";
	}
	

}
