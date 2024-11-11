package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	StudentRepository studentRepo;

	@Override
	public boolean addStudent(Student std) {
		boolean result = false;
		studentRepo.save(std);
		result=true;
		
		return result;
	}
	
	@Override
	public boolean deleteStd(int id) {
		boolean result = false;
		
		studentRepo.deleteById(id);
		result= true;
		
		return result;
	}
	
	@Override
	public Object readById(int id) {
		// TODO Auto-generated method stub
		
		Optional<Student>optional = studentRepo.findById(id);
		if(optional.isPresent()) {
			optional.get();
			
		}
		return optional.get();
	}

	@Override
	public boolean updateStudent(int id) {
		// TODO Auto-generated method stub
		
		Student std = (Student) readById(id);
	    if(std!=null) {
	    	std.setMarks(89.25);
	    	std.setAge(19);
	    	std.setName("priya");
	    	std.setContact(145468589);
	    	
	    	studentRepo.save(std);
	    }
		return false;
	}


	@Override
	public List<Student> readAll() {
		// TODO Auto-generated method stub
		
		return studentRepo.findAll();
	}

	
}
