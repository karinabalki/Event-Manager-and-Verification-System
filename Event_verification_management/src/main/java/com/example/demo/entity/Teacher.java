package com.example.demo.entity;

import java.util.List;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
//import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Teachertbl")
public class Teacher {
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private String subject;
	
//	@OneToMany()
//	private List<Student> stdlist;
	
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


	public String getSubject() {
		return subject;
	}


	public void setSubject(String subject) {
		this.subject = subject;
	}


//	public List<Student> getStdlist() {
//		return stdlist;
//	}
//
//
//	public void setStdlist(List<Student> stdlist) {
//		this.stdlist = stdlist;
//	}


	@Override
	public String toString() {
		return "Teacher [id=" + id + ", name=" + name + ", subject=" + subject + "]";
	}
	
	
	
	public Teacher(int id, String name, String subject, List<Student> stdlist) {
		super();
		this.id = id;
		this.name = name;
		this.subject = subject;
		//this.stdlist = stdlist;
	}


	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	

}
