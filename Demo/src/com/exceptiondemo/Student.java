package com.exceptiondemo;

import java.util.Scanner;

public class Student {

	int rollno;
	String name;
	int mark;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	public void setData() throws InvalidMarkExcpetion
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Rollno ");
		rollno=sc.nextInt();
		System.out.println("Enter Name ");
		name=sc.next();
		System.out.println("Enter mark ot of 100");
		mark=sc.nextInt();
		if(mark <0 || mark>100)
			throw new InvalidMarkExcpetion(mark);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj=new Student();
		try {
			obj.setData();
		} catch (InvalidMarkExcpetion e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
		}

	}

}
