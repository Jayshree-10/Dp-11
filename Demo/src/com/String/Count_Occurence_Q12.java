package com.String;
import java.util.Scanner;
public class Count_Occurence_Q12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str="Abhishek";
		char charr[] = str.toCharArray();
		System.out.println(str);
 		System.out.println("***************************");
		System.out.println("Find how many times a charcter occures in string");
		int count = 0;
		System.out.println("Enter character to know how many times it  occures");
		char ch2 = sc.next().charAt(0);
		for (int i = 0; i < charr.length; i++) {

			if (ch2 == charr[i]) {
				System.out.println(i);
 				count++;
			}
		}
		System.out.println(count);


	}

}
