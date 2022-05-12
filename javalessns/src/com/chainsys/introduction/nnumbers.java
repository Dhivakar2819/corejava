package com.chainsys.introduction;

public class nnumbers {
	public static void main(String[] args) {
		java.util.Scanner sc=new java.util.Scanner(System.in);
		System.out.println("enter the number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		sc.close();
		int temp=a;
		a=b;
		b=temp;
		System.out.println(a +b);
	}

}
