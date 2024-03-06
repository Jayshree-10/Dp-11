package com.String;

public class Anagram_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhi";
		String str1="Aibh";
		char ch1[]=str.toCharArray();
		char ch2[]=str.toCharArray();
		int count=0;
		for(int i=0;i<ch1.length;i++)
		{
			for(int j=0;j<ch2.length;j++)
			{
				if(ch1[i]==ch2[j])
				{
					count++;
				}
			}
		}
		if(count==ch1.length)
		{
			System.out.println("This is Anagram");
		}
		else
			System.out.println("This is not Anagram");

	}

}
