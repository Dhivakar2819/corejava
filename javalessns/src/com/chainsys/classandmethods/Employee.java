package com.chainsys.classandmethods;
/**
 * This a class that contains employees related data
 * the person has id, name,city and salary properties
 * @author dhiv3131
 * Created no : 25 march 2022
 */
public class Employee {
	private final int empID;
	private String name;
	private String city;
	private long salary;
	//constructor
	public Employee(int id)
	{
		//assigning value to read only field
		this.empID=id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String Name) {
		name= Name;
	}
	public int getEmpID() {
		return empID;
	}
	public String getCity()
	{
		return city;
	}
	public void setCity(String city) {
		this.city=city;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary)
	{
		this.salary=salary;
	}
	
      
}
