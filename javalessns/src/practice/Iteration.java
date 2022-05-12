package practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Iteration {
	public static void  main(String[] args) {
		TestCollection12();
	}
	public static void practice1() {
		Queue a= new Queue();
		a.add(2);
		a.add(5);
		a.add(3);
		//a.set(2,6);
		System.out.println(a);
		System.out.println(a.contains(2));
		Iterator<Integer>b=a.iterator();
		while(b.hasNext()) {
			System.out.println(b.next());
		}
	}
	public static void TestCollection12(){  
		
		PriorityQueue<String> queue=new PriorityQueue<String>();  
		queue.add("Amit");  
		queue.add("Vijay");  
		queue.add("Karan");  
		queue.add("Jai");  
		queue.add("Rahul");  
		System.out.println("head:"+queue.element());  
		System.out.println("head:"+queue.peek());  
		System.out.println("iterating the queue elements:");  
		Iterator itr=queue.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		}  
		queue.remove();  
		queue.poll();  
		System.out.println("after removing two elements:");  
		Iterator<String> itr2=queue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next());  
		}  
		}  
		}  
	

