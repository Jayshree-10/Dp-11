package com.String;

public class Trim_Leading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="  Hello  ";
		int j=0;
		str.trim();
		//System.out.println(str);
		while(j<str.length()&&str.charAt(j)<=32)
		{
			j++;
		}
		System.out.println("The count of space is:"+j);
		String str1=str.substring(j,str.length());
		System.out.println(str1.length());
		System.out.println(str1);

		

	}

}
