package com.chainsys.variables;
/***
 * @author dhiv3131
 * created on : 25 March 2022
 */
public class Calculator {
	/**
	 * Add method: will take 2 integer value using the following parameter,
	 * and will add the values. The result of  totaling will be returned back to the caller
	 * This a static method,object reference is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int add(int param1, int param2)
	{
		 int result=param1+param2;
		 return result;
	}
	/**
	 * /**
	 * Multiply method: will take 2 integer value using the following parameter,
	 * and will add the values. The result of  totaling will be returned back to the caller
	 * This a static method,object reference is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int multiply(int param1, int param2)
	{
		 int result=param1*param2;
		 return result;
	} 
	/**
	 * /**
	 * divide method: will take 2 integer value using the following parameter,
	 * and will add the values. The result of  totaling will be returned back to the caller
	 * This a static method,object reference is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int divide(int param1, int param2)
	{
		 int result=param1/param2;
		 return result;
	} 
	/**
	 * /**
	 * Subtract method: will take 2 integer value using the following parameter,
	 * and will add the values. The result of  totaling will be returned back to the caller
	 * This a static method,object reference is not required.
	 * @param param1 of type int
	 * @param param2 of type int
	 * @return type int
	 */
	public int subtract(int param1, int param2)
	{
		 int result=param1-param2;
		 return result;
	}
	
}


