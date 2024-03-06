package com.String;

import java.util.Scanner;

public class Occurence_Char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abhishekiekh";
		System.out.println(str);
		Scanner sc = new Scanner(System.in);
		System.out.println("************************\n By Method index of");
		System.out.println("Enter character to know the first occurence");
		char ch = sc.next().charAt(0);
		System.out.println(str.indexOf(ch));
		System.out.println("************************\n By Logic");
		char charr[] = str.toCharArray();
		System.out.println("Enter character to know first occurence");
		char ch1 = sc.next().charAt(0);
		for (int i = 0; i < charr.length; i++) {

			if (ch1 == charr[i]) {
				System.out.println(i);
				break;
			}
		}
		System.out.println("***************************");
		System.out.println("Find how many times a charcter occures in string");
		int count = 0;
		System.out.println("Enter character to know how many times it  occures");
		char ch2 = sc.next().charAt(0);
		for (int i = 0; i < charr.length; i++) {

			if (ch2 == charr[i]) {
				count++;
			}
		}
		System.out.println(count);

	}

}
