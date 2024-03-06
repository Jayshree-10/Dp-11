package com.methodlocalinner;

public class Outer {

	int outer_a;
	public Outer() {
		// TODO Auto-generated constructor stub
		outer_a=100;
	}
	public void show()
	{
		class Inner
		{
			int inner_a;
			Inner()
			{
				inner_a=111;
			}
			public void show()
			{
				System.out.println("Outer data "+outer_a);
				System.out.println("Inner data "+inner_a);
			}
		}
		Inner in=new Inner();
		in.show();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Outer o=new Outer();
		o.show();
	}

}
