package com.puretask.exception;

public class EmployeeNotFoundException extends RuntimeException{
	
	public EmployeeNotFoundException(String message) {
		super(message);
	}
}
