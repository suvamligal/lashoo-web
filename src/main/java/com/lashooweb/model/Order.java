package com.lashooweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
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
@Table(name="order_tbl")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int order_id;
	
	private String name;
	private int price;
	private int count;
	
	@ManyToOne
	@JoinColumn(name="customer_id", referencedColumnName = "customerId")
	private Customer customer;
	

}
