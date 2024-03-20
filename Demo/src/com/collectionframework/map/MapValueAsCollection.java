package com.collectionframework.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapValueAsCollection {

	public static void printMap(HashMap<Integer,ArrayList<String>>map)
	{
		Set<Integer> set=map.keySet();
		Iterator<Integer> itr=set.iterator();
		while(itr.hasNext())
		{
			int key=itr.next();
			ArrayList<String> value=map.get(key);
			System.out.println(key +" :" +value);
		}
	}
	public static void checkSkill(HashMap<Integer,ArrayList<String>> map,String skill)
	{
		Set<Entry<Integer, ArrayList<String>>> entry=map.entrySet();
		Iterator<Entry<Integer, ArrayList<String>>> itr=entry.iterator();
		while(itr.hasNext())
		{
			Entry<Integer, ArrayList<String>>  e=itr.next();
			int key=e.getKey();
			ArrayList<String> val=e.getValue();
			for(String str:val)
			{
				
				if(str.equalsIgnoreCase(skill))
				{
					System.out.println(key);
				}
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       HashMap<Integer,ArrayList<String>> skillSet=new HashMap<Integer, ArrayList<String>>();
       ArrayList<String> a1=new ArrayList<String>(Arrays.asList("Java","Android"));
       skillSet.put(101, a1);
       ArrayList<String> a2=new ArrayList<String>(Arrays.asList("C","C++","DS"));
       skillSet.put(103, a2);
       ArrayList<String> a3=new ArrayList<String>(Arrays.asList("CSS","Bootstrap","React","express"));
       skillSet.put(108, a3);
       ArrayList<String> a4=new ArrayList<String>(Arrays.asList("C#","ASP.Net","Dot Net Core"));
       skillSet.put(110, a4);
       ArrayList<String> a5=new ArrayList<String>(Arrays.asList("Java","Hibernate","Spring","SpringBoot"));
       skillSet.put(105, a5);
       
       printMap(skillSet);
       checkSkill(skillSet, "java");   
       
       
	}

}
