package com.String;

import java.util.Arrays;

public class Replace_Word_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am a boy";
		String s[]=str.split(" ");
		String str1="boy";
		String str2="girl";
		
		for(int i=0;i<s.length;i++)
		{
			if(s[i].equals(str1))
			{
				s[i]=str2;
			}
		}
 	//	System.out.print(Arrays.toString(s));
 		for(String a:s)
 		{
 			//System.out.print(a+" ");
 		}
 		String s4="";
 		for(int i=0;i<s.length;i++)
 		{
 			s4=s4+s[i]+" ";
  		}
 		//System.out.println(s4);
 		s4=String.join(" ", s);
  		System.out.println(s4);


	}

}
