package com.chainsys.oops.interfaces;

public interface InterfaceA {
	
		void m1();
		void m2();
		void print();
		default void print(String type)
		{
			System.out.println("print");
		}
		static void echo()
		{
			System.out.println("Static Echo");
		}
	

}
