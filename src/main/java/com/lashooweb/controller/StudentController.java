package com.lashooweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lashooweb.model.Student;
import com.lashooweb.repository.StudentRepository;
import com.lashooweb.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepo;
	
	@Autowired
	private StudentService studentService;
	
	@GetMapping("/getStudents")
	public List<Student> getStudent() {
		return studentService.findAllStudents();
	}
	
	@PostMapping("/addStudents")
	public String addStudent(@RequestBody Student student) {
		
		System.out.println("Emails on controller layer is  \n" + student.getEmails());
		System.out.println("Student on controller layer is \n" + student);
		
		studentService.saveStudents(student);
		return "saved";
	}

}
