package com.chainsys.collection;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

class DictionaryPropDemo {
	public static void main(String args[])
	{
	Properties capitals= new Properties ();
	Set<Object> states;
	String str;
	capitals.put("Illinois", "Springfield");
	capitals.put("Florida", "Tallahass");
	capitals.put ("Missouri", "Jefferson City");
	capitals.put ("Washington", "Olympis");
	capitals.put ("California", "sacramento");
	capitals.put ("Indiana", "Indianapolis");
	states =capitals.keySet(); // get set-view of keys 
	Iterator<Object> itr =states.iterator(); 
	while (itr.hasNext ())
	{
	str =(String) itr.next();
	System.out.println("The capital of " + str + " "+capitals.getProperty (str)+ ".");
	str=capitals.getProperty ("Florida", "Not Found"); 
	//str = capitals.get Property ("Florida"); 
	System.out.println("The capital of Florida is "+str);
}}}
