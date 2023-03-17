package com.lashooweb.dto;

import org.springframework.beans.factory.annotation.Autowired;

import com.lashooweb.model.Customer;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class OrderRequestDTO {

	@Autowired
	private Customer customer;
}
