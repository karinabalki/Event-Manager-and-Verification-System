package com.example.demo.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stdTable")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column
	private String name;
	@Column
	private int age;
	@Column
	private double marks;
	@Column
	private long contact;
	
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public double getMarks() {
		return marks;
	}


	public void setMarks(double marks) {
		this.marks = marks;
	}


	public long getContact() {
		return contact;
	}


	public void setContact(long contact) {
		this.contact = contact;
	}


	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + ", marks=" + marks + ", contact=" + contact
				+ "]";
	}


	public Student(int id, String name, int age, double marks, long contact) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.marks = marks;
		this.contact = contact;
	}


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
