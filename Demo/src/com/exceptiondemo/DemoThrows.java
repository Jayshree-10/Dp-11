package com.exceptiondemo;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

public class DemoThrows {

	public void show() throws IOException,NullPointerException
	{
	    System.out.println(" i am in show");
	    FileInputStream fin=new FileInputStream("myfile.java");
	    
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoThrows obj=new DemoThrows();
		try 
		{
			obj.show();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main ends");
	}

}
