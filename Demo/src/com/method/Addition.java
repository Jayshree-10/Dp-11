package com.method;

public class Addition {

	/*
	 *  accessmodifer returntype methodName(argList)
	 *  {
	 *  	return type
	 *  }
	 *  return type :primitive or userdefined ,Array,collection
	 *  or void
	 *  public,protected,private,default
	 *  
	 *  
	 * */
	public int add(int i,int j)
	{
		int res=i+j;
		
	   return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       /*
        * 	Object creation syntax:
        *   Classname variable=new Classname();
        *   
        * */		
           Addition obj=new Addition();
           int res=obj.add(12,34);
           System.out.println(res);
	}

}
