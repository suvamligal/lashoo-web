package com.lashooweb.service;

import java.util.List;

import com.lashooweb.model.Employee;

public interface EmployeeService {
	
	public void save(Employee employee);

	public List<Employee> findAll();

}

