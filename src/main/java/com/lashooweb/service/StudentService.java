package com.lashooweb.service;

import java.util.List;

import com.lashooweb.model.Student;

public interface StudentService {

	void saveStudents(Student student);

	List<Student> findAllStudents();
	
	

}
