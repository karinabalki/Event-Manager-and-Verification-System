package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;

public interface StudentService {
	
	public boolean addStudent(Student std);
	
	public boolean deleteStd(int id);
	
	public Object readById(int id);
	
	public boolean updateStudent(int id);
	
	public List<Student> readAll();

}




