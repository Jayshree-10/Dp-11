package com.jayshree;

public class Employee {

	// data members
	// private ,default,protected,public
	private int eid;
	private String name,email;
	private double sal;
	//constructor : is a special method which has same name with class , and no return
	public Employee() {
		// TODO Auto-generated constructor stub
		eid=101;
		
	}
	
	public Employee(int eid, String name, String email, double sal) {
		super();
		this.eid = eid;
		this.name = name;
		this.email = email;
		this.sal = sal;
	}

	//get methods accessor
	public int getEid()
	{
		return eid;
	}
	//mutator
	public void setEid(int eid)
	{
		this.eid=eid;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public double calculateSal()
	{
		return sal;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Employee();
		obj.eid=101;
		obj.name="Amey";
		obj.email="a@gmail.com";
		obj.sal=56000.50;
		Employee obj1=new Employee(102, "Vikas", "v@gmail.com", 45000);
	}

}
