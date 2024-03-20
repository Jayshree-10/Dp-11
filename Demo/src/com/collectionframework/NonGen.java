package com.collectionframework;

public class NonGen {

	Object obj;
	public NonGen() {
		// TODO Auto-generated constructor stub
	}
	public NonGen(Object o)
	{
		obj=o;
	}
	public Object getObject()
	{
		return obj;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NonGen obj=new NonGen(12);
		obj.showType();
		int i=(int) obj.getObject();
		
		NonGen obj1=new NonGen("Java");
		obj1.showType();
		String str=(String) obj1.getObject();
		obj=obj1; //no compile time error both are belonging to same class 
		int ii=(int) obj.getObject(); // runtie exception ClassCastException
		
		
		

	}

}
