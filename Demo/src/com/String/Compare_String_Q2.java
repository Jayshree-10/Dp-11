package com.String;

public class Compare_String_Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Abhishek";
		String s1="Abhishek";
 		System.out.println(s.compareTo(s1));
		// when we compare two strig which are create by using new then there reference is same
 		if(s==s1)
		{
			System.out.println("Equal");
		}

	}

}
