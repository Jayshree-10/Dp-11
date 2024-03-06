package com.String;

public class Copy_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Abhishek";
		char ch[]=s.toCharArray();
		//String s3=s.copyValueOf(ch);
		//String s1=new String(ch);
 		//System.out.println(s1);
 		char ch1[]=new char[s.length()];
 		System.arraycopy(ch, 0, ch1, 0, ch1.length);
 		System.out.println(ch1);
 		

		

	}

}
