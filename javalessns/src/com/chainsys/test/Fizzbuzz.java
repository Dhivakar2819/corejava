package com.chainsys.test;

public class Fizzbuzz {
//	public static void main(String[] args) {
//		fizzbuzz();
//	}
	public static void fizzbuzz() {
		for (int count = 1; count <= 100; count++) {
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println("Fizzbuzz");
			} else if (count % 3 == 0) {
				System.out.println("Fizz");
			} else if (count % 5 == 0) {
				System.out.println("Buzzbuzz");
			} else {
				System.out.println(count);
			}

		}
	}

	public static void evenDigit() {
		int num = 1546903;
		while (num > 0) {
			int reminder = num % 10;
			if (reminder % 2 == 0) {
				System.out.println(reminder);
			}
			num = num / 10;
		}
	}
	public static void stringCount()
	{
		String s2="Tom and Jerry are good friends";
		String trims2 = s2.trim();
		String[] splits2 =trims2.split(" ");
		int count = splits2.length;
		System.out.println("Word Count " + count);
		
		char[] chars2=s2.toCharArray();
		int length=chars2.length;
		for(int index=length-1;index>=0;index--)
		{
			System.out.print(chars2[index]);
		}
	}
	public static void equation()
	{
		for(int x=5;x<=10;x++)
		{
			int y=2*x*x+x+5;
			System.out.println("if x =" + x);
			System.out.println(y);
		}
	}
	public static void climate()
	{
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println(" Is it raining? " + "                              Press 1");
		System.out.println(" If the temperature colder than 32 degrees " + "   Press 2");
		System.out.println(" If the temperature between 32 and 50 degrees " + "Press 3");
		System.out.println(" If its normal temperature " + "                   Press 4 or above");
		int choice=sc.nextInt();
		switch(choice) {
		case 1:{
			System.out.println("get an umbrella");
			break;
		}
		case 2:
		{
			System.out.println("to bring a heavy jacket ");
			break;
		}
		case 3:
		{
			System.out.println("to bring a light jacket ");
			break;
		}
		default:
		{
			System.out.println("no jacket at all");
			break;
		}
		}
	}

	public static void armstrongNumber() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter any three digite number");
		int number = sc.nextInt();
		sc.close();
		int numberstore = number;
		int total = 0;
		while (number > 0) {
			int reminder = number % 10;
			total = total + (reminder * reminder * reminder);
			number = number / 10;
		}
		if (numberstore == total) {
			System.out.println("Same as input number");
		} else {
			System.out.println("different number");
		}
	}

	public static void triangle() {
		for (int countA = 1; countA <= 9; countA++) {
			for (int countB = 9; countB > countA; countB--) {
				System.out.print(".");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD);
			}

			System.out.println();
		}
	}

	public static void inputName() {
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.println("Enter the Name :");
		String name = sc.nextLine();
		sc.close();
		int length = name.length();
		int count = 0;
		char[] Name = name.toCharArray();
		if (length >= 8) {
			for (int index = 0; index < length; index++)

			{

				if ((Name[index] >= 65 && Name[index] <= 90) || (Name[index] >= 97 && Name[index] <= 122)) {
					continue;
				} else {
					System.out.println("The Name must be in Alphabet only");
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println("Your name is " + name);
			}
		} else {
			System.out.println("The name have adleast 8 letters");
		}

	}
}
