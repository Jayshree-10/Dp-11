package com.collectiondemos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set<Integer> set=new HashSet<Integer>();
		set.add(10);
		set.add(10);
		set.add(20);
		set.add(30);
		System.out.println(set);
		
		Set<Integer> sset=new TreeSet<>();
		sset.add(345);
		sset.add(23);
		sset.add(80);
		sset.add(78);
		sset.add(25);
		System.out.println(sset);
		
	}

}
