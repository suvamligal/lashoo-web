package com.lashooweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
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
@Table(name="address_tbl")
public class Address {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int adress_id;
	
	private String street;
	private String city;
	private String state;
	private String county;
	private String country;
	private String zipCode;
	
	@OneToOne()
	@JoinColumn(name="emp_id", referencedColumnName = "employee_id")
	private Employee employee;

}
