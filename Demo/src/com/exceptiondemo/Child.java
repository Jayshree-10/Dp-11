package com.exceptiondemo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

class Parent
{
	public void show() throws  IOException // Exception //IOException,SQLException,NullPointerException
	{
		System.out.println("in Parent show()");
	}
}
public class Child extends Parent {

	public void show() throws FileNotFoundException,IOException
	{
		super.show();
		System.out.println("In Child show()");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		try {
			obj.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
