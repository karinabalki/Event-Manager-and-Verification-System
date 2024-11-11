package com.example.demo.services;

import java.util.List;

import com.example.demo.entity.Student;
import com.example.demo.entity.Teacher;

public interface TeacherService {
	public boolean addTeacher(Teacher teacher);
	public boolean deleteTeacher(int tid);
	public Object readById(int id);
	public boolean updateTeacher(int tid);
	public List<Teacher>readAllTeacher();
	
	public List<Student>readAllStudent();
	public void addStudent(Student std);
	public void deleteStudent(int id);
	public Object readByIdStudent(int id);
	public void updateStudent(int id);

}
