package com.pack1;

public class TestSamePackage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassDemo1 obj=new ClassDemo1();
		obj.show();

		ClassDemo1SubClassSamePackage obj1=new ClassDemo1SubClassSamePackage();
		obj1.checkProtectedMethod();
	}

}
