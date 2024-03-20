package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class CharFrequencyUsingMap {

	public static HashMap<Character,Integer> createMap(String str)
	{
		HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		char ch[]=str.toCharArray();
		for(char c:ch)
		{
			if(map.containsKey(c))
			{
				int cnt=map.get(c);
				cnt++;
				map.put(c, cnt);
			}
			else
			{
				map.put(c,1);
			}
			
		}
		return map;
	}
	public static void print(HashMap<Character, Integer>map)
	{
		Set<Entry<Character, Integer>> set=map.entrySet();
		for(Entry<Character, Integer> ele:set)
		{
			System.out.println(ele.getKey()+" : "+ele.getValue());
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name="Java programming";
		HashMap<Character, Integer> map=createMap(name);
		print(map);
	}

}
