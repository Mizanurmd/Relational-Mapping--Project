package com.oneToMany.model;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="std_Table")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sname;
	
	
	@OneToMany
	@JoinColumn(name="sidFK")
	private Set<Book> boks;


	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Student(int sid, String sname, Set<Book> boks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.boks = boks;
	}


	public int getSid() {
		return sid;
	}


	public void setSid(int sid) {
		this.sid = sid;
	}


	public String getSname() {
		return sname;
	}


	public void setSname(String sname) {
		this.sname = sname;
	}


	public Set<Book> getBoks() {
		return boks;
	}


	public void setBoks(Set<Book> boks) {
		this.boks = boks;
	}
	
	
	

}
