package com.chainsys.unittest;

import com.chainsys.classandmethods.Person;

public class Persontester {
	public static void test() {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("Enter the id no. :");
		int id= sc.nextInt();
		Person firstperson=new Person(id);
		
//		System.out.println(" ");
		String scannersolution=sc.nextLine();
		System.out.println("Enter the Name :");
		String name=sc.nextLine();
		firstperson.setName(name);
		
		System.out.println("Enter the Branch :");
		String branch=sc.nextLine();
		firstperson.setBranch(branch);
		
		System.out.println("Enter the Address :");
		String address=sc.nextLine();
		firstperson.setAddress(address);
		
		System.out.println("Enter the E-Mail Address :");
		String email=sc.nextLine();
		firstperson.setE_mail_address(email);
		
		System.out.println("Enter the Phone Number :");
		long phonenumber=sc.nextLong();
		firstperson.setPhone_number(phonenumber);
		
		sc.close();
		
		System.out.println("Name : "+firstperson.getName());
		System.out.println("Id :" +firstperson.getId());
		System.out.println("Branch :" +firstperson.getBranch());
		System.out.println("Address :"+firstperson.getAddress());
		System.out.println("E-mail Address :" +firstperson.getE_mail_address());
		System.out.println("Phone Number :"+firstperson.getPhone_number());
	}

}
