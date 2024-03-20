package com.collectionframework.list;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
class Mycomparator implements Comparator<Integer>
{
	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		System.out.println("in comparator");
		if(o1==o2)
			return 0;
		else if(o1<o2)
			return 1;
		else 
			return -1;
	}
	
}
public class ComparatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	List<Integer>list= Arrays.asList(1,34,56,12,45,67,21,99,78);
	System.out.println(list);
	Collections.sort(list);
	System.out.println(list);
	System.out.println("Descending order sorting ");
	Collections.sort(list, new Mycomparator());
	System.out.println(list);

	}

}
