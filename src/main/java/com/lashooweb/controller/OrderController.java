package com.lashooweb.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lashooweb.dto.OrderRequestDTO;

@RestController
@RequestMapping("/orders")
public class OrderController{
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping("/addOrder")
	public ResponseEntity<String> addOrder(@RequestBody OrderRequestDTO orderRequestDTO){
		customerService.saveOrder(orderRequestDTO.getCustomer());
		 return ResponseEntity.ok("Orders Saved");
	}

}

