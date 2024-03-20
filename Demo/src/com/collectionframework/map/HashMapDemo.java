package com.collectionframework.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Map<Integer, String>city=new HashMap<Integer, String>();
		System.out.println(city.put(12, "Pune"));
		city.put(41, "Malegaon");
		city.put(15, "Nasik");
		city.put(1, "Mumbai");
		city.put(13, "Solpur");
		city.put(19,"Jalgoan");
		city.put(45, "Sangola");
		city.put(11, "Satara");
		
		System.out.println(city);
		System.out.println(city.put(1, "Navi Mumbai"));
		System.out.println(city);
		
	}
	}

