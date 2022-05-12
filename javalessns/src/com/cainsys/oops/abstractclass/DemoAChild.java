package com.cainsys.oops.abstractclass;

public class DemoAChild {

	public DemoAChild() {
		System.out.println("DemoAChild Object Created " + hashCode());
	}

	public static void testDemoA() {
//			AbsDemoA a1=new AbsDemoA();//abstract class
		AbsDemoA.show();// static method

		DemoAChild b1 = new DemoAChild();// child class
		b1.echo();// parent.echo()
	}

}
