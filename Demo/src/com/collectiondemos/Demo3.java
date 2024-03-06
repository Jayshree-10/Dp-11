package com.collectiondemos;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer,String> map=new HashMap<Integer, String>();
		map.put(1, "Rakesh");
		map.put(3, "Mahesh");
		map.put(2, "Prakash");
		map.put(4, "Vijay");
		map.put(7, "Rahul");
		
		Set<Entry<Integer,String>> set=map.entrySet();
		Iterator<Entry<Integer, String>>itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, String> e=itr.next();
			System.out.println(e.getKey()+" : "+e.getValue());
			
		}
		

	}

}
