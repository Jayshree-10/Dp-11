package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListCRUD {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Integer> arr=Arrays.asList(1,2,3,4,5,6,7);
		ArrayList<Integer> arrList=new ArrayList<Integer>(arr);
		System.out.println(arrList.contains(4));
		System.out.println(arrList.indexOf(3));
		arrList.remove(3);
		System.out.println(arrList);
		//remove Object
		arrList.remove(2); //remove element by 2 position
		System.out.println(arrList);
		arrList.remove(new Integer(2));
		System.out.println(arrList);
		Integer obj=7;
		arrList.remove(obj);
		System.out.println(arrList);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(5);
		a2.add(6);
		arrList.removeAll(a2);
		System.out.println(arrList);
		Integer[] i=(Integer[]) a2.toArray();
		//arrList.retainAll(collection)
		
	}

}
