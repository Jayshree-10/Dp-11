package com.exceptiondemo;

import java.util.Arrays;

public class Demo1 {

    public static void show()
    {
    	
		
			int arr[]= {1,2,3,4,5};
			String str=null;
			System.out.println(str.length());
			arr[6]=10;
			System.out.println(Arrays.toString(arr));
		
    	     System.out.println("Method ends");
    	
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main starts");
		try
		{
			show();
		}
		
		/*catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			//e.printStackTrace();
			
		}
		catch(NullPointerException ex)
		{
			ex.printStackTrace();
		}
		catch(ArithmeticException ex)
		{
			System.out.println(ex.getMessage());
		}*/
		catch(ArrayIndexOutOfBoundsException|NullPointerException |ArithmeticException  ex )
		{
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		System.out.println("main ends");

	}

}
