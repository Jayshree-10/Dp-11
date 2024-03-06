package com.exceptiondemo;

public class Demo2 {

	public int show()
	{
		 int num=0;
		try
		{
			System.out.println("I am try");
			 num=4/2;
			System.out.println(num); 
		}
	/*	catch(ArithmeticException e)
		{
			e.printStackTrace();
		}*/
		finally
		{
			System.out.println("i am in finally block");
			
		}
		return num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("i am in main");
		Demo2 obj=new Demo2();
		//try
		{
			System.out.println(obj.show());
		}
		/*catch(ArithmeticException e)
		{
			System.out.println(e);
		}*/
		System.out.println("main ends");
	}

}
