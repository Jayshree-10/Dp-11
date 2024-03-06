package com.wrapperdemo;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// converting primitive into an Object : boxing
		Integer iobj=new Integer(10);
		
		//converting Object into primitive type : unboxing
		int i=iobj.intValue();
		
		Float fobj=new Float(10.4f);
		float f=fobj.floatValue();
		
		// jdk1.5 autoboxing and autounboxing
		int i1=10;
		Integer obj1=i1; // primitive is automatically converted into an Object (autoboxing)
		
		int j=obj1; //  object automatically converted  to primitive type (autounboxing)
        
	}

}
