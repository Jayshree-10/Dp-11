package com.String;

public class Compare_String_Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("Abhi");
		String s2=new String("Abhi");
		String s3="Abhi";
		// when we compare two strig which are create by using new then there reference is differnet
		if(s1==s2)
		{
			System.out.println("Equal");
		}
		else
			System.out.println("Not equal");

	}

}
