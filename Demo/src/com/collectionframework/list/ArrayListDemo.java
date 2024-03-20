package com.collectionframework.list;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<Integer>();
		//add element
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr);
		arr.add(1, 11);
		System.out.println(arr);
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(2);
		a1.add(3);
		a1.add(4);
		arr.addAll(a1);
		System.out.println(arr);
		
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(5);
		a2.add(10);
		arr.addAll(2, a2);
		System.out.println(arr);
		
	}

}
