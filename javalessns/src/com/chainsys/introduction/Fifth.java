package com.chainsys.introduction;

public class Fifth {
	public static void main(String[] args) {
		Even1();
	}

	public static void printnumbersTentoOne() {
		int count = 10;
		for (count = 10; count >= 1; count--) {
			System.out.println(count + " ");
		}
	}

	public static void printMatrix() {

		for (int countA = 1; countA <= 5; countA++) {
			for (int countB = 5; countB > countA; countB--) {
				System.out.print(" ");
			}
			for (int countC = countA; countC >= 1; countC--) {
				System.out.print(countC);
			}
			for (int countD = 2; countD <= countA; countD++) {
				System.out.print(countD);
			}

			System.out.println();
		}
		for (int countA = 4; countA >= 1; countA--) {
			for (int countD = 4; countD >= countA; countD--) {
				System.out.print(" ");
			}
			for (int countB = countA; countB >= 1; countB--) {
				System.out.print(countB);
			}
			for (int countC = 2; countC <= countA; countC++) {
				System.out.print(countC);
			}
			System.out.println();
		}
	}

	public static void Triangle() {
		for (int countA = 1; countA <= 10; countA += 2) {
			for (int countB = 1; countB <= countA; countB++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

	

	public static void Even() {
    	 for(int i=1;i<=100;i++)
    	 {
    		 if(i%2==0)
    		 {
    			 System.out.println(i);
    		 }
    	 }}
    public static void Even1() {
    	for(int i=2;i<=100;i+=2)
    	{
    		System.out.println(i);
    	}
    
     }

}
