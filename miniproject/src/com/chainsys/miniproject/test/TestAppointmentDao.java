package com.chainsys.miniproject.test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;

import com.chainsys.miniproject.dao.AppointmentDao;
import com.chainsys.miniproject.pojo.Appointment;

public class TestAppointmentDao {
	
	
		public static void testGetAllAppointment() {
			List<Appointment> allAppointment =AppointmentDao.getAllAppointment();
			Iterator<Appointment> appIterator = allAppointment.iterator();
			while (appIterator.hasNext()) {
				Appointment app = appIterator.next();
				System.out.println(app.getApp_id() + " " + app.getPatient_name() +" "+app.getDoc_id());
			}
		}

		public static void testGetAppointmentById() {
			Appointment app =AppointmentDao.getAppointmentById(1);
			System.out.println(app.getApp_id() + " " + app.getPatient_name() +" "+app.getDoc_id());		}

		public static void testInsertAppointment() {
			Appointment newapp = new Appointment();
			newapp.setApp_id(11);
			Calendar c1 = Calendar.getInstance();
			java.util.Date newDate = c1.getTime();
			newapp.setApp_date(newDate);
			newapp.setDoc_id(4);
			newapp.setPatient_name("Velmurugan");
			newapp.setFees_collected(500);
			int result = AppointmentDao.insertAppointment(newapp);
			System.out.println(result);
		}

		public static void testUpdateAppointment() {
				Appointment app = new Appointment();
				app.setApp_id(102);
				Calendar c1 = Calendar.getInstance();
				java.util.Date newDate = c1.getTime();
				app.setApp_date(newDate);
				app.setDoc_id(3);
				app.setPatient_name("Boruto uzumaki");
				app.setFees_collected(10);
				
				int result = AppointmentDao.updateAppointment(app);
				System.out.println(result+" row updated");
				
			}
			

		public static void testDeleteAppointment() {
			int result = AppointmentDao.deleteAppointment(6);
			System.out.println(result);
		}



}
