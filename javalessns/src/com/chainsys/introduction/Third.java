package com.chainsys.introduction;

public class Third {

	public static void main(String[] args) {
		byte b1=127;
		System.out.println("b1; "+ b1);
        short s1=32767;
        System.out.println("s1; " + s1);
        short s2=-32768;
        System.out.println("s2; " + s2);
        int intmaxvalue=2147483647;
        System.out.println("max value : "+ intmaxvalue);
        int intminvalue=-2147483648;
        System.out.println("min value : "+ intminvalue);
        long longmaxvalue=9223372036854775807L;
        System.out.println("max value : "+ longmaxvalue);
        long longminvalue=-9223372036854775808L;
        System.out.println("min value : "+ longminvalue);
        float floatmaxvalue=217483647.5432F;
        System.out.println("max value : "+ floatmaxvalue);
        float floatminvalue=-217483648.11111F;
        System.out.println("min value : "+ floatminvalue);
        double doublemaxvalue=217483647.5432D;
        System.out.println("max value : "+ doublemaxvalue);
        double doubleminvalue=-217483648.11111D;
        System.out.println("min value : "+ doubleminvalue);char c1='A';
        System.out.println("c1: "+ c1);
        char c2='a';
        System.out.println("c2: "+ c2);
        int asciivalueofc1=(int)c1;
        System.out.println(asciivalueofc1);
        char c3=(char) 90;
        System.out.println("c3 :"+c3);
        boolean flag=false;
        System.out.println(flag);
        
        
	}

}
