package com.String;

public class Concatenation_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1;
		String s2;
		s1 = "Abhishek ";
		s2 = "Rai ";
		// concat method
		String s3 = s1.concat(s2);
		String s4 = s2.concat(s1);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s1.concat(s2));
//		System.out.println(s1);
//		System.out.println(s2); 
		System.out.println("**************");

		// Arithmetic operator
		String s5 = s1 + s2;
		System.out.println(s5);
		// System.out.println(s1+s2);
		System.out.println("*****************");
		System.out.println("Concat by using tocharArray");
		
		//Concat by using tocharArray
		char ch[] = s1.toCharArray();
		char ch1[] = s2.toCharArray();
		char ch3[] = new char[ch.length + ch1.length];
		System.arraycopy(ch, 0, ch3, 0, ch.length);
		System.arraycopy(ch1,  0, ch3, ch.length, ch1.length);
		System.out.println(ch3);//Array
		String s6=new String(ch3);
		System.out.println(s6);//String
 		 

	}

}
