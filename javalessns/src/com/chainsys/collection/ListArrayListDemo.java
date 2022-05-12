package com.chainsys.collection;

import java.util.ArrayList;

public class ListArrayListDemo {
 public static void usingStringArrayList() {
	 ArrayList<String> stringArrayList= new ArrayList<String>();
	 System.out.println("Initial size of stringArrayList: "+stringArrayList.size());
	 try {
		 stringArrayList.add("Car");
		 stringArrayList.add("Auto");
		 stringArrayList.add("Egg");
		 stringArrayList.add("box");
		 stringArrayList.add("Doll");
		 stringArrayList.add("Fan");
//		 will insert a new value
		 //pushing the current value of index 1 to the next index
		 stringArrayList.add(1,"Animal");
		 stringArrayList.add("Girl");
		 stringArrayList.add("Fan");
		 System.out.println("Size of stringArrayList after addition: "+ stringArrayList.size());
		 System.out.println("Contents of stringArrayList: "+ stringArrayList);
		 //will replace the value in index 2
		 stringArrayList.set(2, "xenas");
		 System.out.println("After set(2) : "+stringArrayList.size());
		 System.out.println("Last Index od : 'Fan' "+stringArrayList.lastIndexOf("Fan"));
		//remove the first instance of fan
         stringArrayList.remove("Fan");
//         stringArrayList.remove(2);
         System.out.println("size after remove(2):"+stringArrayList.size());
         System.out.println("contents of stringArrayList" +stringArrayList);
         //will reduce the capacity
         stringArrayList.trimToSize();
     }
     catch(Exception err) {
         System.out.println(err.getMessage());
     }
 }

}
