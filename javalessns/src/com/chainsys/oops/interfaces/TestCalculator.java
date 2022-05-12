package com.chainsys.oops.interfaces;

import com.chainsys.variables.Calculator;

public class TestCalculator {
//public static void main(String[] args) {
public static void add() {
		Calculator sc = new Calculator();
		int add=sc.add(10, 5);
		System.out.println(add);
		int divide=sc.divide(10, 5);
		System.out.println(divide);
		int multiply=sc.multiply(10, 5);
		System.out.println(multiply);
}
}
