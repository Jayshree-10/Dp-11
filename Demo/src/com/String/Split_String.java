package com.String;

import java.util.Arrays;

public class Split_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Jayshree$Chaudhary";
		char ch[] = s.toCharArray();
		String s1[] = s.split("\\$", 2);
		System.out.println(Arrays.toString(s1));
		System.out.println(s1[0]);
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '$') {
				ch[i] = ' ';
			}
		}
		System.out.println(ch);
		
	/*	System.out.println("*********************");
		String str="Java$program$simple";
		char ch[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='$')
			{
				count++;
			}
		}
		System.out.println(count);
		ch=new char[count];
		
		//System.out.println(ch[0]);
 */
	}

}
