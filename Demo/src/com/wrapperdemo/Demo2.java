package com.wrapperdemo;

public class Demo2 {

	public static void mymethod(Double l)
	{
		System.out.println("in Double parameter");
	}
	public static void mymethod(Long i)
	{
		System.out.println("in Long parameter");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=21;
		//mymethod(21);
		/*
		 * Primitive int type can be auto-widened to big sized
		 *  primitive types 
		 * or can be auto-boxed to Integer wrapper class type
		 *  but can not be converted
		 *  into Double or Long wrapper class type.
		 * */

	}

}
