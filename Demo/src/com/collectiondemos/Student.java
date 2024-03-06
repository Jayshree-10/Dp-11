package com.collectiondemos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Student implements Comparable<Student>{

	int rollno;
	String name;
	double per;
	public Student() {
		// TODO Auto-generated constructor stub
	}
	
	public Student(int rollno, String name, double per) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.per = per;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPer() {
		return per;
	}

	public void setPer(double per) {
		this.per = per;
	}
    
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Student> arr=new ArrayList<Student>();
		arr.add(new Student(1,"Rajiv",89.0));
		arr.add(new Student(4,"Sushama",65.00));
		arr.add(new Student(2,"Saroj",55.00));
		arr.add(new Student(8,"Nikhil",91.07));
		arr.add(new Student(5,"Amey",78.45));
		arr.add(new Student(3,"Prem",67.56));
		arr.add(new Student(7,"Tushar",56.00));
		
		Iterator<Student> itr =arr.iterator();
		double max=0;
		Student obj=new Student();
		while(itr.hasNext())
		{
			Student s=itr.next();
			if(s.getPer()>max)
			{
				obj=s;
				max=s.getPer();
			}
		}
		System.out.println(obj);
		System.out.println("Before sorting ");
		System.out.println(arr);
		System.out.println("After Sorting");

		Collections.sort(arr);
		System.out.println(arr);
		
		System.out.println("Sorting by name");
		Collections.sort(arr, new StudentNameSorting());
		System.out.println(arr); 
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(this.per<o.per)
			return 1;
		else if(this.per>o.per)
			return -1;
		else
			return 0;
	}

}
