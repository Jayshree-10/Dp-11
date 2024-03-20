package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class AppleHashMap {

	public static void print(HashMap<Apple, Integer> map)
	{
		Set<Entry<Apple, Integer>> set=map.entrySet();
		for(Entry<Apple, Integer> e:set)
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Apple, Integer> map=new HashMap<Apple, Integer>();
		map.put(new Apple("Simla",100), 5);
		map.put(new Apple("Washinton",350), 2);
		map.put(new Apple("Green",250), 3);
		map.put(new Apple("Kashmiri",150), 8);

		print(map);
        System.out.println("Value from map is "+map.get(new Apple("Green",250))); // null
        map.put(new Apple("Simla",150), 15);
        System.out.println("After adding same key");
        print(map);
	}

}
