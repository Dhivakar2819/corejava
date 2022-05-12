package com.chainsys.strings;

public class StringLessonA {
	public static void lessonOne() {
		String firstString = "Chainsys";
		System.out.println(firstString);
		char dataOne[] = { 'C', 'h', 'a', 'i', 'n' };
		String secondString = new String(dataOne);
		System.out.println(secondString);
		String thirdString = new String(new char[] { 'C', 'h', 'a', 'i', 'n' });
		System.out.println(thirdString);
	}

	public static void lessonTwo() {
		String firstString = "Hello";
		String secondString = "Hello";
		String thirdString = "Hello";
		int firstNumber = 100;
		int secondNumber = 100;
		int thirdNumber = 100;
		System.out.println(firstString);
		System.out.println(secondString);
	}

	public static void creatingStringForLoop() {
		for (int count = 0; count < 10; count++) {
			String s1 = "Hello";
			System.out.println(s1);
		}
	}

	public static void stringCharArray() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString = scanner.nextLine();
		scanner.close();
		int stringlength = firstString.length();
		System.out.println("Length " + stringlength);
		char[] data = firstString.toCharArray();
		int dataarraylength = data.length;
		System.out.println("Length " + dataarraylength);

	}

	public static void stringToUpperLower() {
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.println("Enter a WORD");
		String firstString = scanner.nextLine();
		scanner.close();
		System.out.println(firstString);
		String stringInUppercase = firstString.toUpperCase();
		System.out.println("toUppercase = " + stringInUppercase);

		System.out.println("s1=" + firstString);
		String stringInLowercase = firstString.toLowerCase();
		System.out.println("toLowercase " + stringInLowercase);
		System.out.println("s1= " + firstString);
		String substring = firstString.substring(3);
		System.out.println(substring);
		substring = firstString.substring(2, 6);
		System.out.println(substring);
		String replacestring = firstString.replace('a', 'e');
		System.out.println(replacestring);
		boolean flag1 = firstString.equals(stringInUppercase);
		System.out.println(flag1);
		boolean flag = firstString.equalsIgnoreCase(stringInUppercase);
		System.out.println(flag);
	}

	public static void testStringTrim() {
		String secondString = "   Hope     it    rain   ";
		System.out.println("Before Trim : " + secondString.length());
		secondString = secondString.trim();
		System.out.println("After Trim  : " + secondString.length());
	}

	public static void testSplit() {
		String firstString = "  Tom and Jerry are good friends  ";
		String trimmedString = firstString.trim();
		String[] data = trimmedString.split(" ");
		int count = data.length;
		System.out.println("Word Count " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}

	public static void testSplitDays() {
		String weekdays = "Mon;Tue;Wed;Thu;Fri;Sat;Sun";
		String[] data = weekdays.split(";");
		int count = data.length;
		System.out.println("Word Count " + count);
		for (int index = 0; index < count; index++) {
			System.out.println(data[index]);
		}
	}
	public static void reverse()
	{
		java.util.Scanner scanner=new java.util.Scanner(System.in);
		System.out.println("Enter the reverse String ");
		String reverseWord="";
		try {
			reverseWord=scanner.nextLine();
		}
		finally {
		    scanner.close();
		}
		char[] data=reverseWord.toCharArray();
		int count = data.length;
		for(int index=count-1;index>=0;index--)
		{
			System.out.print(data[index]);
		}
	}
	public static void verifyString(String s1)
	{
		if(null==s1)
		{
			System.out.println("Stirng in Null");
			return;
		}
		else
			System.out.println("String is not Null "+ s1);
	
		if(!s1.isEmpty())
		{
			System.out.println("\t Not Empty "+s1);
		}
		else
		{
			System.out.println("\t String is Empty");
		}
		
	}

}
