package com.chainsys.unittest;

import com.chainsys.variables.Bank;
import java.util.Scanner;
/**
 * 
 * @author dhiv3131
 * Date : 25 March 2022
 */
public class BankTest {
	
	
	public static void testdeposite() {
		Bank.deposit(1000);
		System.out.println("Deposite amount " + Bank.currentBalance);
	}
	public static void testwithdraw() {
		int balance=Bank.withdraw(300);
		System.out.println("current balance  " +balance);
	}
	public static void testopenAccount() {
		Bank.openAccount("Dhivakar",1234567890);
		System.out.println(Bank.customerName);
		System.out.println(Bank.accountNumber);
		
	}

}
