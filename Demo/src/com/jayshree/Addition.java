package com.jayshree;

public class Addition {

	//method overloading : 
	/* keep method name same
	 * change : no of arguments
	 * sequence of arguments
	 * return type is not considered.
	 * called it as compile time/static  polymorphism
	 * */
	/*public int add(int i,int j)
	{
		return i+j;
	}*/
	
	public float add(float f1,float f2)
	{
		return f1+f2;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition obj=new Addition();
		System.out.println(obj.add(12, 12));
		System.out.println(obj.add(12.4f, 12.5f));
	}

}
