package com.elearning.coursemanagement.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.elearning.coursemanagement.model.Student;
@Repository
public interface StudentDao extends CrudRepository<Student,Integer> {
	
public Student findByName(String name);
public List<Student>  findAll();
}

