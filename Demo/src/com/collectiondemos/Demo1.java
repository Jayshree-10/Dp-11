package com.collectiondemos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Demo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List l1=new ArrayList();
		l1.add(1);
		l1.add("Java");
		l1.add(45.5);
		
		Iterator ii=l1.iterator();
		while(ii.hasNext())
		{
			System.out.println(ii.next());
			//int i=(int) ii.next();
		}
		List<Integer> ilist=new ArrayList<>();
		ilist.add(12);
		ilist.add(13);
		ilist.add(14);
		
		System.out.println(ilist);
		Iterator<Integer> itr=ilist.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		LinkedList<Integer> link=new LinkedList<Integer>();
		link.add(1);
		
		

	}

}
