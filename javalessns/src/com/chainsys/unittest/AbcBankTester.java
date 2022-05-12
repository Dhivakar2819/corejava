package com.chainsys.unittest;

import com.chainsys.test.AbcBank;
import java.util.Scanner.*;
public class AbcBankTester {
	public static void testAbcBank()
	{   
	    System.out.println("to enter customer detail press 1");
	    System.out.println("To enter employee detail press any number");
		java.util.Scanner sc= new java.util.Scanner(System.in);
		int count=sc.nextInt();
		switch(count)
		{case 1:{
		System.out.println("enter the mobile number");
		long phoneNumber=sc.nextLong();
		AbcBank firstbank=new AbcBank(phoneNumber);
		
		System.out.println("Enter the Account number");
	    long accountNumber=sc.nextLong();
	    firstbank.setAccountNumber(accountNumber);
	    System.out.println(firstbank.getAccountNumber());
	    
		System.out.println(" ");
		
		
		System.out.println("Enter the customer name");
		String customerName=sc.nextLine();
		firstbank.setCustomerName(customerName);
		System.out.println(firstbank.getCustomerName());
		
		System.out.println("Enter the address");
		String address=sc.nextLine();
		firstbank.setAddress(address);
		System.out.println(firstbank.getAddress());
		
		System.out.println("Enter the email id");
		String emailId=sc.nextLine();
		firstbank.setEmailId(emailId);
		System.out.println(firstbank.getEmailId());
		
		
		sc.close();
		}
		default:
		{
			System.out.println("enter the mobile number");
			long phoneNumber=sc.nextLong();
			AbcBank firstbank=new AbcBank(phoneNumber);
			
			System.out.println("Enter the Account number");
		    long accountNumber=sc.nextLong();
		    firstbank.setAccountNumber(accountNumber);
		    System.out.println(firstbank.getAccountNumber());
		    
			System.out.println(" ");
			
			
			System.out.println("Enter the employee name");
			String employeeName=sc.nextLine();
			firstbank.setCustomerName(employeeName);
			System.out.println(firstbank.getEmployeeName());
			
			System.out.println("Enter the address");
			String address=sc.nextLine();
			firstbank.setAddress(address);
			System.out.println(firstbank.getAddress());
			
			System.out.println("Enter the email id");
			String emailId=sc.nextLine();
			firstbank.setEmailId(emailId);
			System.out.println(firstbank.getEmailId());
			
			
			sc.close();}
		}
	}	
}