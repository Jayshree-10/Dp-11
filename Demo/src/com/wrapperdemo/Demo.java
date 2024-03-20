package com.wrapperdemo;

public class Demo {

	public static void mymethod(long l)
	{
		System.out.println("in long parameter");
	}
	public static void mymethod(Integer i)
	{
		System.out.println("in Integer parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=21;
		mymethod(i);
		
		// auto-widening is happening not auto-boxing.
		

		
	}

}
