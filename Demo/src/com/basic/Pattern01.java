package com.basic;


public class Pattern01 {

	
	    public static void main(String[] args) {
	        int n = 5; // Number of rows in the pattern
	        for (int i = 1; i <= n; i++) {
	            for (int j = 1; j <= i; j++) {
	                if (j % 2 != 0) {
	                    System.out.print("1 ");
	                } else {
	                    System.out.print("0 ");
	                }
	            }
	            System.out.println();
	        }
	        for(int i=4; i>=1; i--) // rows 
	        {
	        	char ch='A';
	        	for(int j=0; j<i; j++)
	        	{
	        		System.err.print(((char)(ch+j))+" " );
	        	}
	        	System.out.println();
	        }
	    }
	

	    
	

}
