package com.example.demo.services;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;
import com.example.demo.repository.StudentRepository;
import com.example.demo.repository.TeacherRepository;


@Service
public class TeacherServicesImpl implements TeacherService{

	@Autowired
	TeacherRepository TeacherRepo;
	
	@Autowired
	StudentRepository StudentRepo;
	
	@Override
	public boolean addTeacher(Teacher teacher) {
		// TODO Auto-generated method stub
		TeacherRepo.save(teacher);
		return true;
	}

	@Override
	public boolean deleteTeacher(int tid) {
		// TODO Auto-generated method stub
		TeacherRepo.deleteById(tid);
		return true;	
	}

	@Override
	public boolean updateTeacher(int tid) {
		// TODO Auto-generated method stub
		Teacher teacher = (Teacher) readById(tid);
		if(teacher!=null) {
			teacher.setName("Pranay");
			teacher.setSubject("Geometry");
		}
		TeacherRepo.save(teacher);
		return true;
	}

	@Override
	public Object readById(int tid) {
		// TODO Auto-generated method stub
		Optional<Teacher>optional = TeacherRepo.findById(tid);
		if(optional.isPresent()) {
			optional.get();
		}
		return optional.get();
	}

	@Override
	public List<Teacher> readAllTeacher() {
		// TODO Auto-generated method stub
		
		return TeacherRepo.findAll();
	}

	@Override
	public List<Student> readAllStudent() {
		// TODO Auto-generated method stub
		return StudentRepo.findAll();
	}

	@Override
	public void addStudent(Student std) {
		// TODO Auto-generated method stub
		StudentRepo.save(std);
	}

	@Override
	public void deleteStudent(int id) {
		// TODO Auto-generated method stub
		StudentRepo.deleteById(id);
	}

	@Override
	public Object readByIdStudent(int id) {
		// TODO Auto-generated method stub
		Optional<Student>opational = StudentRepo.findById(id);
		if(opational.isPresent()) {
			opational.get();
		}
		return opational.get();
	}

	@Override
	public void updateStudent(int id) {
		// TODO Auto-generated method stub
		Student std = (Student) readByIdStudent(id);
		if(std!=null) {
			std.setName("Nikhil");
			std.setMarks(70.58);
			std.setContact(98563214);
		}
		StudentRepo.save(std);
	}

}
