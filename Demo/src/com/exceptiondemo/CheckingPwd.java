package com.exceptiondemo;

public class CheckingPwd {

	public static boolean checkPWD(String p)
	{
		String digit="0123456789";
		String spcialChar="!@#$%&*";
		if(p.length()<8)
		{
			System.out.println("Password should contain minimum 8 Characters");
			return false;
		}
		else 
		{
			
			char parr[]=p.toCharArray();
			
			for(int i=0; i<parr.length; i++)
			{
				if(parr[i]=='!' || parr[i]=='@'|| parr[i]=='#' || parr[i]=='$'
						|| parr[i]=='%' || parr[i]=='&')
				{
					System.out.println("Contains Special chars");
					return true; 
				}
			}
			
			for(int i=0; i<p.length(); i++)
			{
				if((p.charAt(i)>='A' || p.charAt(i)<='Z'))
				{
					System.out.println(" Contains Upper case ");
					return true;
				}	
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           String pwd="Jayshr@10";
           checkPWD(pwd);
          // System.out.println("Every thing is fine");
	}

}
