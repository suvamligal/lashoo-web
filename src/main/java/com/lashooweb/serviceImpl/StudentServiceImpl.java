package com.lashooweb.serviceImpl;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lashooweb.model.Email;
import com.lashooweb.model.Student;
import com.lashooweb.repository.StudentRepository;
import com.lashooweb.service.StudentService;
import com.lashooweb.utils.DateUtils;

@Service
public class StudentServiceImpl implements StudentService {

	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void saveStudents(Student student) {

		student.setJoinedDate(DateUtils.ConvertDateToMMddyyyy(new Date()));
		studentRepository.save(student);

	}

	@Override
	public List<Student> findAllStudents() {
		return studentRepository.findAll();
	}

}
