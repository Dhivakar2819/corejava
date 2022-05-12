package com.chainsys.introduction;

import java.util.Scanner;

public class Sixth {
	public static void main(String[] args) {
		swap();
	}
	public static void checkUserName() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String UserName=sc.nextLine();
		sc.close();
		System.out.println("Name is " + UserName);
		char[]nameAsCharacter=UserName.toCharArray();
		int LengthofCharArray = nameAsCharacter.length;
		System.out.println("Length of your name "+ LengthofCharArray);
		
				for(int index=0;index<LengthofCharArray;index++)
		{
			System.out.println(index + " " + nameAsCharacter[index]);
		}
		
	}
	public static void checkUserName1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String UserName=sc.nextLine();
		sc.close();
		System.out.println("Name is " + UserName);
		char[]nameAsCharacter=UserName.toCharArray();
		int lengthofCharArray = nameAsCharacter.length;
		System.out.println("Length of your name "+ lengthofCharArray);
		if(lengthofCharArray<3)
		{
			System.out.println("Name must have atleast 3 charts ");
			return;
			
		}
		if(lengthofCharArray>15)
		{
			System.out.println("Name must nohave more than 15 charts ");
		    return;
		}
		String nameInUpperCase = UserName.toUpperCase();
		nameInUpperCase = nameInUpperCase.trim();
		char[] uppercaseCharArray = nameInUpperCase.toCharArray();
		lengthofCharArray = uppercaseCharArray.length;
		int asciiValue = 0;
		for(int index=0;index<lengthofCharArray;index++)
		{
		    asciiValue = (int) uppercaseCharArray[index];
		    System.out.println("ASCII : " +asciiValue );
		    if(asciiValue > 65 || asciiValue < 90)
		    {
			System.out.println(index + " " + nameAsCharacter[index]);
		    return;
		    }
		}

	}
	public static void findEvenNumbers() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any 10 digit number");
		long value=sc.nextLong();
		sc.close();
		long num= value;
		long reminder=0;
		while(num>0) {
			reminder=num%10;
			if(reminder%2==0)
			{
				System.out.println(reminder);
			}
			num=num/10;
		}
		
	}
	public static void swap() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		sc.close();
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a + " " + b);
	}
}
