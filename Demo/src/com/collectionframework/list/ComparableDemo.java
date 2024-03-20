package com.collectionframework.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;


public class ComparableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(1,7,34,2,7,5,22,4,9,6);
		System.out.println("Using Collection Clas");
		System.out.println("Reverse List");
		Collections.reverse(list);
		System.out.println(list);
		System.out.println("Before sorting");
		System.out.println(list);
		Collections.sort(list);
		
		System.out.println("After sorting");
		System.out.println(list);
		Collections.reverse(list);
		System.out.println("Reverse list");
		System.out.println(list);
		
		List<String> strList=Arrays.asList("Priya","anant","medha","amol","pankaj","shrikant");
		System.out.println("Before sorting");
		System.out.println(strList);
		Collections.sort(strList);
		System.out.println(strList);
		
	}
	

}
