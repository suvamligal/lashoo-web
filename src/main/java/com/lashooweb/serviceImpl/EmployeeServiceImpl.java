package com.lashooweb.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lashooweb.model.Employee;
import com.lashooweb.repository.EmployeeRepository;
import com.lashooweb.service.EmployeeService;

import jakarta.transaction.Transactional;



@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void save(Employee employee) {
		employeeRepository.save(employee);		
	}

	@Override
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	
	
	
	
	

}
