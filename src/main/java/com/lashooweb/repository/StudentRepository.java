package com.lashooweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lashooweb.model.Student;

@Repository

public interface StudentRepository extends JpaRepository<Student, Integer>{

}
