package com.cainsys.oops.abstractclass;


public class AbsDemoB {
	public abstract void echo();
	}
	// Abstract class must be inherited
	// abstract methods must be overriden
	class DemoBChild extends AbsDemoB
	{
		public void echo() {
			System.out.println("Overriding the abstract method");
		}
	}

public Demo	
