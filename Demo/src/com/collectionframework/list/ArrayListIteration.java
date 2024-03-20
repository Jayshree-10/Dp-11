package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayListIteration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> arr=new ArrayList<Integer>();
		//add element
		arr.add(10);
		arr.add(20);
		arr.add(30);
		System.out.println(arr); // toString()
		//for loop
		for(int i=0; i<arr.size(); i++)
			System.out.print(arr.get(i)+" ");
		System.out.println();
		System.out.println("Using Enhance for loop");
		// Enhance for loop
		for(Integer e:arr)
		{
			System.out.print(e + " ");
		}
		System.out.println("using Iterator");
		// Iterator
		Iterator<Integer>itr=arr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			arr.remove(1);
			//itr.remove();
		}
		System.out.println("After remove method");
		System.out.println(arr);
		System.out.println("Using ListIterator ");
		ListIterator<Integer>litr1=arr.listIterator();
		litr1.add(101);

		while(litr1.hasNext())
		{
			System.out.println(litr1.next());
		}
		
		System.out.println("Using List iterator in reverse accessing");
		ListIterator<Integer>litr=arr.listIterator(arr.size());
		while(litr.hasPrevious())
		{
			System.out.println(litr.previous());
		}
		
	}

}
