package com.exceptiondemo;

public class InvalidMarkExcpetion extends Exception {
	
	int marks;
	public InvalidMarkExcpetion() {
		// TODO Auto-generated constructor stub
	}
	public InvalidMarkExcpetion(int m)
	{
		marks=m;
	}
	public String toString()
	{
		return marks+ " are invalid marks";
	}
    
}
