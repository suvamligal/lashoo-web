package com.lashooweb.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
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
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="role_id")   //In employee_tbl "role_id" column is joined. 
	private Role role;
	
	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	@JoinColumn(name="address_id")  //In employee table, a column with name "address_id" is created which is a foreign key of table "address_tbl". 
	private Address address;

}
