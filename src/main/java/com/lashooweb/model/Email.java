package com.lashooweb.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "Email_tbl")
public class Email {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int email_id;

	private String name;

//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "std_fk")
//	private Student student;

}
