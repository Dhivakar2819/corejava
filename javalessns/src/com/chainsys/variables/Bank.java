package com.chainsys.variables;
/***
 * @author dhiv3131
 * created on : 25 March 2022
 */
public class Bank {
	
	public static int currentBalance;
	public static String customerName;
	public static int accountNumber;
	public static void deposit(int amount) 
	{
		currentBalance= currentBalance + amount;
//		return currentBalance;
	}
	/**
	 * Add method: will take 2 integer value using the following parameter,
	 * and will add the values. The result of  totaling will be returned back to the caller
	 * This a static method,object reference is not required.
	 * @param Amount of type int
	 * 
	 */
	
	public static int withdraw(int Amount)
	{
		currentBalance=currentBalance-Amount;
		return currentBalance;
	}
	public static void openAccount(String name,int paramaccountNumber)
	{
		customerName=name;
		accountNumber=paramaccountNumber;
	}
	

}
