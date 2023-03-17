package com.lashooweb.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lashooweb.controller.CustomerService;
import com.lashooweb.model.Customer;
import com.lashooweb.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	private CustomerRepository customerRepository;

	@Override
	public void saveOrder(Customer customer) {
		customerRepository.save(customer);
		
	}
	
	

}
