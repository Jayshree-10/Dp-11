package com.method;

public class FindFactorialOfNumber {

	public int findFactorial(int num)
	{
		int fact=1;
		//
		
		return fact;
		
	}
	public int sumOfDigit(int num)
	{ 
		/*
		 *  num=125 = 1+2+5 =>8
		 *  num%10=>5
		 *  num/10=>12
		 *  num%10=>2
		 *  num/10=>1
		 *  num%10=>1;
		 *  num/10=>0
		 * */
		int sum=0;
		for(int i=num; i>=1;i=i/10)
		{
			int digit=i%10;
			sum=sum+digit;
		}
		
		return sum;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindFactorialOfNumber obj=new FindFactorialOfNumber();
		int s=obj.sumOfDigit(125);
		System.out.println(s);
	}

}
