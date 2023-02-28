package com.lashooweb.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
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
@Entity
@Table(name="customer_tbl")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;
	
	// private Address address;
	
	@OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
	private List<Order> orders;
	
	

}
