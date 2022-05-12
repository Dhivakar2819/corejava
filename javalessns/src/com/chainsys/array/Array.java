package com.chainsys.array;

import java.util.Scanner;
import java.util.*;

public class Array {
	
public static void arrays() {
	int number [] = {10,20,30,40,50};
	String name = "Dhivakar";
	String surname = "Subramanian";
	int stringlength=name.length();
	int lengthofnumber=number.length;
	System.out.println("length of String :"+ name+" "+surname);
	System.out.println("length of number ="+lengthofnumber);
	for(int x:number) {
		System.out.println(x + ",");
	}
	System.out.println();
}
public static void creatingAnotherArray() {
//	int days[];
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the Days");
	int size=sc.nextInt();
	String days[]=new String[size];
	int lengthofdays=days.length;
	System.out.println("No.of Days "+ lengthofdays);
	String scannerSolution =sc.nextLine();
	for(int index=0;index<=size-1;index++)
	{    System.out.println("enter the days");
		 days[index]=sc.nextLine();
		 System.out.println("days["+index+"]="+days[index]);
	}
//	for(int i=0;i<lengthofdays;i++) {
//		days[i]=(int)(Math.random()*10);
//	}
//	for(int x:days)
//	{
//		System.out.println(x);
//	}
	sc.close();
}
}
