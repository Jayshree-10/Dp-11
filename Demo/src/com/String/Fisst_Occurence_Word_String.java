package com.String;

public class Fisst_Occurence_Word_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Abhishek is very naughty boy";
 		//System.out.println(str.indexOf("is"));
  		for(int i=0;i<str.length();i++)
 		{
 			String temp="";
 			int j;
 			for(j=i;j<str.length()&&str.charAt(j)!=32;j++)
 			{
 				temp=temp+str.charAt(j);
 
 			}
 
 			if(temp.equals("is"))
 			{
 				System.out.println(j-temp.length());
 				break;
 			}
 		}
 
	}

}
