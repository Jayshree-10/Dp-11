package com.String;

public class Last_Occurence_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhieshek";
		char ch[]=str.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			if('e'==ch[i])
			{
				System.out.println(i);
				break;
			}
		}
	}

}
