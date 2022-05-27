package com.chainsys.miniproject.entry;

import java.util.Scanner;
import com.chainsys.miniproject.ui.AppointmentUi;
import com.chainsys.miniproject.ui.DoctorUi;
import com.chainsys.miniproject.ui.EmployeeUi;

public class Startup {
	public static void main(String args[]) {
		loadMenu();
	}

	public static void loadMenu() {
		System.out.println("Enter Menu : 1 is EmployeeMenu, 2 is Doctor Menu, 3 is Appointment Menu ");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int call = sc.nextInt();
			switch (call) {
			case 1:
				loadEmployeeMenu();
				break;
			case 2:
				loadDoctorMenu();
				break;
			case 3:
				loadAppointmentMenu();
				break;
			}
		} finally {
			sc.close();
		}
	}

	public static void loadEmployeeMenu() {
		System.out.println(
				"Enter Employee Method : 1=addNewEmployee, 2=getEmployeeDetails ,3=getAllEmployeeDetails ,4=updateEmployeeDetails, 5=deleteEmployee");
		java.util.Scanner sc = new java.util.Scanner(System.in);
		try {
			int choice = sc.nextInt();

			switch (choice) {
			case 1:
				EmployeeUi.addNewEmployee();
				break;

			case 2:
				EmployeeUi.getEmployeeDetails();
				break;
			case 3:
				EmployeeUi.getAllEmployeeDetails();
				break;
			case 4:
				EmployeeUi.updateEmployeeDetails();
				break;
			case 5:
				EmployeeUi.deleteEmployee();
				break;
			}
		} finally {
			sc.close();
		}
	}

	public static void loadDoctorMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println(
				"Enter Employee Method : 1=addNewDoctorInformation ,"
				+ "2=updateDoctorDetails ,3=deleteDoctorDetails ,"
				+ "4=viewDoctorsDetailsById ,5=viewAllDoctorsDetails");
		
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				DoctorUi.addNewDoctorInformation();
				break;
			case 2:
				DoctorUi.updateDoctorDetails();
				break;
			case 3:
				DoctorUi.deleteDoctorDetails();
				break;
			case 4:
				DoctorUi.viewDoctorsDetailsById();
				break;
			case 5:
				DoctorUi.viewAllDoctorsDetails();
				break;
			default:
				System.out.println("Enter the value between 1 to 5");
			}

		} finally {
			sc.close();
		}
	}

	private static void loadAppointmentMenu() {
		Scanner sc = new Scanner(System.in);
		System.out.println("press 1 for add new appointment");
		System.out.println("press 2 for see the appointment details");
		System.out.println("press 3 for see all appointments detail");
		System.out.println("press 4 for update appointment details");
		System.out.println("press 5 for delete appointment detail");
		System.out.println("press 6 for update patient by appointment id");
		System.out.println("press 7 for update collected fees");
		try {
			int choice = sc.nextInt();
			switch (choice) {
			case 1:
				AppointmentUi.addNewAppointments();
				break;
			case 2:
				AppointmentUi.viewAppointmentDetails();
				break;
			case 3:
				AppointmentUi.allAppointmentDetails();
				break;
			case 4:
				AppointmentUi.updateAppDetails();
				break;
			case 5:
				AppointmentUi.deleteAppointmentDetails();
				break;
			case 6:
				AppointmentUi.updatePatientName();
				break;
			case 7:
				AppointmentUi.updateCollectedfees();
				break;
			default:
				System.out.println("enter the number 7 and below");
			}
		} finally {
			sc.close();
		}
	}

}
