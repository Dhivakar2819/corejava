
package com.chainsys.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class ListArrayListToArray {
	public static void main(String args[]) {
		ArrayList<Integer>a1=new ArrayList<Integer>();
		a1.add(1);
		a1.add(2);
		a1.add(3);
		a1.add(4);
		System.out.println("Contents of s1: "+a1);
		//Object data[]=a1.toArray();
		int sum=0;
		//for(int i=0;i<data.length;i++) {
			//sum+=((Integer)data[i]).intValue();
		Iterator<Integer>intIterator=a1.iterator();
		while(intIterator.hasNext())
		{
			sum+=intIterator.next();
		System.out.println("Sum is : "+sum);
		}
	}

}
