package com.example.demo.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Candidate {
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private String address;
	private Date dob;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public Candidate() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Candidate(int id, String name, String address, Date dob) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.dob = dob;
	}
	

}
