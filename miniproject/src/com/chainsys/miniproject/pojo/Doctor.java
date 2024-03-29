package com.chainsys.miniproject.pojo;

import java.util.Date;
import java.util.List;
public class Doctor {
	private int id;
	private String doc_name;
	private Date DOB;
	private String speciality;
	private String city;
	private long phone_no;
	private float fees;
	
	
	
	public int getDoc_id() {
		return id;
	}
	public void setDoc_id(int doc_id) {
		this.id = doc_id;
	}
	public String getDoc_name() {
		return doc_name;
	}
	public void setDoc_name(String doc_name) {
		this.doc_name = doc_name;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPhone_no() {
		return phone_no;
	}
	public void setPhone_no(long phone_no) {
		this.phone_no = phone_no;
	}
	public float getFees() {
		return fees;
	}
	public void setFees(float fees) {
		this.fees = fees;
	}
	@Override
	public String toString() {
		return String.format("%d, %s, %s, %s, %s",id,doc_name,DOB,city,phone_no);
	}
	public Date getDOB() {
		return DOB;
	}
	public void setDOB(Date dOB) {
		DOB = dOB;
	}
	
	
}
