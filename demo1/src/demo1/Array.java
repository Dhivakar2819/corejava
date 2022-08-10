package demo1;

import java.util.Scanner;

public class Array {
	public static void main(String[] args) {
		array();
	}

	public static void array() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array : ");
		int size = sc.nextInt();
		int[] array=new int[size];
		for (int i = 0; i < size ; i++) {
			System.out.println("Enter the value " + i + " :");
			array[i] = sc.nextInt();
			if (array[i] > 0) {
				continue;
			} else {
				System.out.println("enter the positive value");
				break;
			}

		}

	}
	public static void string() {
		String name="dhivakar";
		System.out.println(name.hashCode());
		name="dhiva";
		System.out.println(name.hashCode());
		StringBuilder sb=new StringBuilder();
		sb.append("dhivakar");
		System.out.println(sb.hashCode());
		sb.append("dhiva");
		System.out.println(sb.hashCode());
		
	}
	

}
