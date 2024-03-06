package com.String;

//import java.util.Arrays;

public class Palindrome_Stirng {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="madam";
		char ch[]=str.toCharArray();
		char ch1[]=new char[ch.length];
		int j=0;
		for(int i=ch.length-1;i>=0;i--)
		{
			ch1[j]=ch[i];
			j++;
		}
		String str1=new String(ch1);
		//System.out.println(str1);
		if(str.equals(str1))
		{
			System.out.println("This is palindrome String");
		}
		

	}

}
