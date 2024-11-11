package com.example.demo;

import java.util.List;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import com.example.demo.entity.Student;
import com.example.demo.services.StudentService;
import com.example.demo.services.StudentServiceImpl;
import com.example.demo.services.TeacherService;
import com.example.demo.services.TeacherServicesImpl;

@SpringBootApplication
@ComponentScan(basePackages = "com.example.demo.services")
public class SpringBootSecondApplication {

	public static void insert() {
		ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class);
		
		StudentService service = context.getBean(StudentServiceImpl.class);
		
//		Student std = new Student(102, "karina", 21, 65.23, 65324789);
//		boolean status = service.addStudent(std);
		
		Student std3 = new Student(103, "priya", 20, 65.23, 65424789);
		boolean status = service.addStudent(std3);
		
		if(status) {
			System.out.println("Data inserted");
		}
		else {
			System.out.println("Try Again");
		}
		
		}
	
	public static void delete() {
		ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class);
		StudentService service = context.getBean(StudentServiceImpl.class);
	
		boolean status = service.deleteStd(152);
		
		
		if(status) {
			System.out.println("Data deleted");
		}
		else {
			System.out.println("Try Again");
		}
		
		}
	
	public static void readMethod() {
		ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class);
		StudentService service = context.getBean(StudentServiceImpl.class);
	
		System.out.println(service.readById(2));
		
	}
	
	public static void updateStudent() {
		ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class);
		StudentService service = context.getBean(StudentServiceImpl.class);
	
		boolean status = service.updateStudent(2);
		if(!status) {
			System.out.println("Data updated");
		}
		else {
			System.out.println("Try Again.....");
		}
		
	}
	
	
	public static void readStudent() {
		ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class);
		StudentService service = context.getBean(StudentServiceImpl.class);
	
		List<Student>stdlist = service.readAll();
		for(Student s:stdlist) {
			System.out.println(s.toString());
		}
		
	}
	
//	public static void main(String[] args) {
//		//insert();
//		//delete();
//		//readMethod();
//		//updateStudent();
//		readStudent();
//	}

	
	
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		boolean result=false;
	ApplicationContext context=SpringApplication.run(SpringBootSecondApplication.class, args);
	
	TeacherService service = context.getBean(TeacherServicesImpl.class);
//	Teacher t1 = new Teacher(202, "Akash", "Physics", null);
//	Teacher t2 = new Teacher(105, "Nikhil", "Maths", null);
//	Teacher t3 = new Teacher(305, "Piyush", "Chemistry", null);
//	service.addTeacher(t1);
//	service.addTeacher(t2);
//	service.addTeacher(t3);
//	result=true;
//	if(result) {
//		System.out.println("Data inserted");
//	}
//	else {
//		System.out.println("Try Again..!!");
//	}
	
//	service.deleteTeacher(202);
	
//	System.out.println(service.readById(305));
	
//	service.updateTeacher(305);
	
	
//	List<Teacher>teacherlist= service.readAllTeacher();
//		for(Teacher t :teacherlist) {
//			System.out.println(t.toString());
//		}
//	
//	List<Student>studentlist= service.readAllStudent();
//		for(Student std:studentlist) {
//			System.out.println(std.toString());
//		}
	
//	Student std = new Student(501, "karan", 90.3, 6589632);
//	service.addStudent(std);
	
//	service.deleteStudent(501);
	
//	System.out.println(service.readByIdStudent(102));
	
	service.updateStudent(102);
	}
}

