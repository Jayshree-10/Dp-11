package com.String;

public class Lower_To_Upper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String s="ABHISHEK";
//		String s1="abhishek";
//		System.out.println(s1.toUpperCase());
//		System.out.println(s.toLowerCase());
		String s3="AbHiShEk";
		//System.out.println(s3.toLowerCase());
		char ch[]=s3.toCharArray();
//		for(int i=0;i<ch.length;i++)
//		{
//			if(ch[i]>='a'&&ch[i]<='z')
//			{
//				ch[i]=(char)(ch[i]-32);
//			}
//		}
		// convert string characters to lower to upper ,upper to lower by logic
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='A'&&ch[i]<='Z')
			{
				ch[i]=(char)(ch[i]+32);
			}
			else if(ch[i]>='a'&&ch[i]<='z')
			{
				ch[i]=(char)(ch[i]-32);
			}
		}
		for(char c:ch)
		{
			System.out.print(c);
		}
		 

	}

}
