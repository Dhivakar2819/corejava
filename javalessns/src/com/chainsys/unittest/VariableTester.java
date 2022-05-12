package com.chainsys.unittest;

import com.chainsys.variables.Demoa;

/*
 * tester class for global variable
 */
public class VariableTester {
         /*
		 * test static,constant,immutable variable
		 */
          public static void testGlobalVariable()
          {
        	  //display the value of static field
        	  //value is zero(default value)
        	  //DataA is accessed without creating an object
        	  System.out.println("DataA:  " + Demoa.DataA);
        	  //display the value of immutable field
        	  //this is not possible without object
        	  //System.out.println("DataB:  " + Demoa.DataB);
        	  //display the value of constant field
        	  System.out.println("DataC:  " + Demoa.DataC);
              //modifying value of the static field DataA
        	  Demoa.DataA=2345;
        	  System.out.println("DataA:  " + Demoa.DataA);
        	  //modifying value of the static field DataC
        	  //ERROR: The final field Demoa.DataC cannot be assigned
        	  //Demoa.DataC=2345;
        	  
          }
                public static void testImmutableVariable()
                {
                	/*
                	 * cannot make a static reference to the non-static field Demoa.DataB
                	 * Demoa.DataB=123;
                	 * 
                	 * First create an object or the class
                	 * pass an int value as an arguments to the constructor
                	 * access the immutable instance field using the object reference
                	 */
                	Demoa firstObject=new Demoa(123);
                	System.out.println(firstObject.DataB);
                	/**
                	 * value assigned to an immutable field can not be changed
                	 * value for the immutable field can be assigned only through the constructor
                	 */
//                	firstObject.DataB=567;
                }
                /**
                 * Calling static method using class name
                 * without creating an object
                 * created n: 25 march 2022
                 */
                public static void testStaticMethod()
                {
                	Demoa.sayHello();
                }
                /**
                 * Calling non-static method using object reference
                 * without creating an object,non-static methods can be called
                 * created n: 25 march 2022
                 */
                public static void testNonStaticMethod()
                {
                	//ERROR
                	//Demoa.greetUser();
                	Demoa firstObject=new Demoa(111);
                	//call the non static method
                	firstObject.greetUser();
                }
	}

