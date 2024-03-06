package com.simpleinnerclass;

public class Outer {

	int outer_a;
	int data;
	Outer()
	{
		outer_a=10;
		data=101;
	}
	public void show()
	{
		System.out.println("Outer Data member "+outer_a);
		Inner obj=new Inner();
		System.out.println("Inner Data member"+obj.inner_a);
		System.out.println(obj.data);
	}
	//data member of Outer class
	class Inner
	{  
		int inner_a;
		int data;
		Inner()
		{
			inner_a=20;
			data=100;
		}
		public void show()
		{
			System.out.println("From Inner show");
			System.out.println("Datamember of Outer class "+outer_a);
			System.out.println(" Outer data "+Outer.this.data);
			System.out.println(" Inner data "+this.data);
			System.out.println("Datamember of Inner class "+inner_a);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer o=new Outer();
		o.show();
		/* 1>
		 *  Outerclassname.Innerclassname obj=outerclassref.new Innerclassname();
		 * 2>
		 *   Outerclasname.Innerclassname obj=new Outerclassname().new Innerclassname(); 
		 * */
		Outer.Inner obj=o.new Inner();
		
		Outer.Inner obj1=new Outer().new Inner();
		obj1.show();
	}

}
