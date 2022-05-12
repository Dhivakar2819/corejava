package com.chainsys.introduction;

public class Fourth {
    public static void main(String[] args){
    	taskA();
    	taskB();
    	taskC();
    }
    public static void taskA() {	
    	java.util.Scanner sc=new java.util.Scanner(System.in);
    	System.out.println("enter the name");
    	String name=sc.next();
//    	sc.close();
    	System.out.println(name);
    }
    public static void taskB() {
    	java.util.Scanner sc1=new java.util.Scanner(System.in);
    	System.out.println("Enter the Number");
    	int firstvalue=sc1.nextInt();
    	int result=firstvalue;
    	System.out.println(result);
//    	sc.close();
    }
    public static void taskC() {
    	String s1="100";
    	String s2="25";
    	System.out.println(s1+s2);
    	int x= Integer.parseInt(s1);
    	int y= Integer.parseInt(s2);
    	int z=x+y;
    	System.out.println(z);
    }
    
   
}
