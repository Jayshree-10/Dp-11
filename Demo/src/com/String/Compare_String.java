package com.String;

public class Compare_String {
	public static void main(String[] args) {
		String str="Abhishek";
		String str1="ABHISHEK";
		int s3=str.compareTo(str1);
		System.out.println(s3);
		System.out.println(str.compareTo("Abhishek"));
		System.out.println(str.compareToIgnoreCase("abhishek"));

	}

}
