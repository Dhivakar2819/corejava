package com.chainsys.doctor.entry;

import java.util.Scanner;

import com.chainsys.doctor.test.*;
import com.chainsys.doctor.ui.*;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;

public class Startup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for doctor details ");
		System.out.println("press 2 for Appointment details");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			DoctorUi.doctorOption();
			break;
		case 2:
			AppointmentUi.appointmentOption();
			break;
		default:
			System.out.println("enter the value 1 or 2");
		}
	}

}
