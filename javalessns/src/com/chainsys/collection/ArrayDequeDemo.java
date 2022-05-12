package com.chainsys.collection;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ArrayDequeDemo {

	public static void main(String[] args) {
		  ArrayDeque<String> arraydeque=new ArrayDeque<String>();
	        //use an ArrayDeque like staack.
	        arraydeque.push("A");
	        arraydeque.push("B");
	        arraydeque.push("X");
	        arraydeque.push("Z");
	        arraydeque.push("D");
	        arraydeque.push("X");//Duplicate Value
	        arraydeque.push("Z");//Duplicate value
	        arraydeque.push("E");
	        arraydeque.push("F");
	        
	        System.out.println("Before popping the Stack : "+arraydeque.size());
//	        while(arraydeque.peek() != null)
//	            System.out.println(arraydeque.pop() + " ");
//	        
//	        System.out.println("After popping the stack: "+arraydeque.size());
	        Iterator<String>iterator=arraydeque.iterator();
//	        while(iterator.hasNext()) {
//	        	System.out.println("\t"+iterator.next());
//	        }
//	        System.out.println();
//	        Iterator<String>iterator1=arraydeque.descendingIterator();
//	        while(iterator1.hasNext()) {
//	        	System.out.println("\t"+iterator1.next());
//	        }
//	        arraydeque.addFirst("H");
//	        arraydeque.addLast("I");
//	        iterator = arraydeque.iterator();
//	         while(iterator.hasNext()) {
//	             System.out.println("\t"  + iterator.next());
//	         }
//	         
//	         System.out.println("PollFirst: " + arraydeque.pollFirst());
//	         System.out.println(arraydeque);
//	         System.out.println("pollLast: " + arraydeque.pollLast());
//	         System.out.println(arraydeque);
//	         System.out.println ("****** ****pollFirst: "+arraydeque.pollFirst());
//	         System.out.println (arraydeque);
//	         System.out.println("************pollLast: "+arraydeque.pollLast ());
//	         System.out.println (arraydeque);
//	         //peekFirst
//	         //Retrieves, but does not remove, the first element of this deque, or //returns null if this deque is empty.
//	         System.out.println("************peekFirst: "+arraydeque.peekFirst());
//	         System.out.println (arraydeque);
//	         System.out.println("************peekLast: "+arraydeque.peekLast () );
//	         System.out.println (arraydeque);
//	         //removeFirst
//	         //Retrieves and removes the first element of this deque.
//	         //This method differs from pollFirst only in that it throws an exception //if this deque is empty.
//	         System.out.println ("**** *****removeFirst: "+arraydeque.removeFirst());
//	         System.out.println (arraydeque);
//	         System.out.println("************removeLast: "+arraydeque.removeLast () );
//	         System.out.println (arraydeque);
	        System.out.println("*removeFirstOccurrence: X "+arraydeque.removeFirstOccurrence ("X"));
	        System.out.println (arraydeque);
	        System.out.println("*remove Last occurrence: 2 "+arraydeque.removeLastOccurrence ("Z")); 
	        System.out.println (arraydeque);
	    }

	}


