package com.chainsys.miniproject.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.DoctorDao;
import com.chainsys.miniproject.pojo.Doctor;

public class TestDoctorDao {

	public static void testGetAllDoctor() {
		List<Doctor> allDoctor = DoctorDao.getAllDoctor();
		Iterator<Doctor> docIterator = allDoctor.iterator();
		while (docIterator.hasNext()) {
			Doctor doc = docIterator.next();
			System.out.println(doc.getDoc_id() + " " + doc.getDoc_name() +" "+doc.getSpeciality()+" "+doc.getCity()+" "+doc.getPhone_no()+" " +doc.getFees());
		}
	}

	public static void testGetDoctorById() {
		Doctor doc = DoctorDao.getDoctorById(3);
		System.out.println(doc.getDoc_id() + " " + doc.getDoc_name() + " " + doc.getDOB()+" "+doc.getSpeciality()+" "+doc.getCity()+" "+doc.getPhone_no()+" " +doc.getFees());
	}

	public static void testInsertDoctor() {
		Doctor newdoc = new Doctor();
		newdoc.setDoc_id(6);
		newdoc.setDoc_name("Vicky");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		newdoc.setDOB(newDate);
		newdoc.setSpeciality("Orthologist");
		newdoc.setCity("madurai");
		newdoc.setPhone_no(9874359328L);
		newdoc.setFees(900);
		int result = DoctorDao.insertDoctor(newdoc);
		System.out.println(result);
	}

	public static void testUpdateDoctor() {
		Doctor olddoc = DoctorDao.getDoctorById(6);
		System.out.println(olddoc.getDoc_id() + " " + olddoc.getDoc_name() + " " + olddoc.getDOB()+" "+olddoc.getSpeciality()+" "+olddoc.getCity()+" "+olddoc.getPhone_no()+" " +olddoc.getFees());
		olddoc.setDoc_id(6);
		olddoc.setDoc_name("Vicky");
		Calendar c1 = Calendar.getInstance();
		java.util.Date newDate = c1.getTime();
		olddoc.setDOB(newDate);
		olddoc.setSpeciality("Orthologist");
		olddoc.setCity("sivagangai");
		olddoc.setPhone_no(9874359328L);
		olddoc.setFees(750);
		int result = DoctorDao.updateDoctor(olddoc);
		System.out.println(result);
	}

	public static void testDeleteDoctor() {
		int result = DoctorDao.deleteDoctor(5);
		System.out.println(result);
	}

}
