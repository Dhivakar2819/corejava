package com.chainsys.unittest;

import com.chainsys.variables.Calculator;

public class CalculatorTester {
	public  void testadd() {
		Calculator firstObject=new Calculator();
		System.out.println(firstObject.add(5, 8));
		
	}
	public static void testsub() {
		Calculator firstObject=new Calculator();
		System.out.println(firstObject.subtract(5, 8));
		
	}
	public static void testmultiply() {
		Calculator firstObject=new Calculator();
		System.out.println(firstObject.multiply(5, 8));
		
	}
	public static void testdivide() {
		Calculator firstObject=new Calculator();
		System.out.println(firstObject.divide(5, 8));
		
	}




}
