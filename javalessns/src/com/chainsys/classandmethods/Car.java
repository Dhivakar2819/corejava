package com.chainsys.classandmethods;

public class Car {
	private final String regNo;
	private int yearOfPurchase;
	private String colour;
	private String fuel;
	
	public Car(String rno)
	{
		this.regNo=rno;
	}

	public String getRegNo() {
		return regNo;
	}

	public int getYearOfPurchase() {
		return yearOfPurchase;
	}

	public void setYearOfPurchase(int yearOfPurchase) {
		this.yearOfPurchase = yearOfPurchase;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

}
