package com.lashooweb.model;

import jakarta.persistence.CascadeType;
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
@Table(name ="employee_tbl")
public class Employee {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int employee_id;
	
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private String email;
	private String username;
	private String password;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")
	private Role role;
	
	@OneToOne(mappedBy = "employee", cascade = CascadeType.ALL)
	private Address address;

}
