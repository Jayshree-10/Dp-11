package com.pack2;

import com.pack1.ClassDemo1;
import com.pack1.ClassDemo1SubClassSamePackage;

public class ClassDemo1SubClass extends ClassDemo1 
{

    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    //    throgh inheritance  
		ClassDemo1SubClass obj=new ClassDemo1SubClass();
		obj.checkProtectedMethod();
		// without Inheritance
		ClassDemo1SubClassSamePackage o=new ClassDemo1SubClassSamePackage();
		//o.checkProtectedMethod();
	
	}
	

}
