package com.collectionframework;

import java.util.ArrayList;

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList arr=new ArrayList();
		arr.add(12);
		arr.add("Java");
		arr.add(12.4);
		Double d=(Double) arr.get(2);
		
		ArrayList<Integer> arrInt=new ArrayList<Integer>();
		arrInt.add(1);
		arrInt.add(2);
		int ii=arrInt.get(0);
		

	}

}
