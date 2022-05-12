package com.chainsys.datelessons;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.GregorianCalendar;
public class WorkingWithDate {
	/*java.lang.StringBuffer

	append(String ) // add string to the end of SB
	insert(int,String ) //add string to the index position of the SB
	replace( ) // replace a word
	delete( int,int)

	ensureCapacity(int) //allocates Memory, does not reduce the size
	setLength(int ) // truncate data

	reverse( )
	deleteCharAt( )
	charAt(int ) // get Char from index 
	setCharAt( ) // replace a char 
	trimToSize() // set the capacity to the length
	substring(int)

	Use StringBuffer or StringBuilder to modify a String Multiple times 
	StringBuffer is  synchronized and used in MultiThreaded (multiuser) Environment
	J2SE 5 adds a new String class called StringBuilder.
	StringBuilder is not synchronized and used in SingleThreaded (singleuser) Environment
	StringBuilder is identical to StringBuffer   */
	
	
	public static void displayCurrentDate()
	{
		Calendar vCalendar = Calendar.getInstance();
		Date date = vCalendar.getTime();
		System.out.println(date);
		SimpleDateFormat dateFormat=new SimpleDateFormat("YYYY-MM-dd");
		System.out.println(dateFormat.format(date));
	}
	public static void displayDOB()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your DOB:(YYYY-MM-DD)  ");
		String dob=sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dob.substring(0, 4));
		int month= Integer.parseInt(dob.substring(5, 7))-1;
		int day = Integer.parseInt(dob.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
	}
	public static void displayDOB1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your DOB:(YYY-MM-DD)  ");
		String dobString=sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dobString.substring(0, 4));
		int month= Integer.parseInt(dobString.substring(5, 7))-1;
		int day = Integer.parseInt(dobString.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
		Calendar date=new GregorianCalendar(year,month,day);
		Date dob=date.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("YYYY-MMM-dd");
		System.out.println("DOB "+f1.format(dob));
	}
	public static void displayDOB2()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Your DOB:(YYY-MM-dd)  ");
		String dobString=sc.nextLine();
		sc.close();
		int year = Integer.parseInt(dobString.substring(0, 4));
		int month= Integer.parseInt(dobString.substring(5, 7))-1;
		int day = Integer.parseInt(dobString.substring(8,10));
		System.out.println(year+"-"+month+"-"+day);
		
		Calendar date=new GregorianCalendar(year,month,day);
		Date dob=date.getTime();
		SimpleDateFormat f1=new SimpleDateFormat("YYYY-MMM-dd");
		System.out.println("DOB "+f1.format(dob));
//		Retirement date
		date.add(Calendar.YEAR,60);
		date.add(Calendar.MONTH,1);
		date.set(Calendar.DAY_OF_MONTH,1);
		date.add(Calendar.DATE,-1);
		System.out.println("DOB "+f1.format(date.getTime()));
	}
}
