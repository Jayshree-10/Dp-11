package com.collectionframework;

public class Gen<E> {

	E obj;
	public Gen() {
		// TODO Auto-generated constructor stub
	}
	public Gen(E o)
	{
		obj=o;
	}
	public E getObject()
	{
		return obj;
	}
	public void showType()
	{
		System.out.println(obj.getClass().getTypeName());
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gen<Integer> obj=new Gen<Integer>(10);
		int i=obj.getObject();
		
		Gen<String> str=new Gen<String>("Java");
		String s=str.getObject();
		//obj=str; //compile time error
		
		
		
		
		
	}

}
