package com.exceptiondemo;

import java.io.IOException;

public class ThrowKeywordDemo {

	public static void show(int a[],int pos)
	{
		if(pos<0 || pos>=a.length-1)
		{
		
				throw new  ArrayIndexOutOfBoundsException((pos-1)+" Index is out of Bound");
	
		}
		else
			
			System.out.println(a[pos-1]);
		
		
	}
	public static void show() throws IOException
	{
		throw new IOException();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]= {1,2,3,4,5};
		int p=7;
		try
		{
			show(arr,p);
			show();
		}
		catch(ArrayIndexOutOfBoundsException | IOException ex)
		{
			System.out.println(ex.getMessage());
		}
			
	}

}
