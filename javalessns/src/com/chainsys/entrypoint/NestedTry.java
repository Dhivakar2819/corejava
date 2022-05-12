package com.chainsys.entrypoint;
import java.util.Scanner;
 class NestedTry {
	static String[] data;
	public static void main(String args[])
	{
		int num=0;
		int numValue=0;
		data=new String[2];
		java.util.Scanner sc=null;
		try
		{
            sc=new Scanner(System.in);
			try {
				System.out.println("Enter value for x");
				data[0]=sc.nextLine();//123--abcd--123
				numValue=Integer.parseInt(data[0]);//data[2]
				System.out.println("The sqare is "+numValue*numValue);
			}
			catch(NumberFormatException nb)
			{
				System.out.println("Not a number");
			}
			num=data.length;
			System.out.println("Array Length"+num);
		}catch(ArrayIndexOutOfBoundsException ne)
		{
			System.out.println("ArrayIndexOutOfBoundsException-No arguments given!!!");
		}
		catch(Exception er)
		{
			System.out.println("Exception "+er.getMessage());
		}
		public static void m4() throws Exception
		{
			Exception e1=new Exception("Error 1");
			Exception e2=new Exception("Error 2",e1);
			throw e2;
		}
	}
}
