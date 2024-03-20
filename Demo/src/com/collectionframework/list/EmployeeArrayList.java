package com.collectionframework.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class EmployeeArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> emparr=new ArrayList<Employee>();
		emparr.add(new Employee(102, 56000, "Anita", "finance"));
		emparr.add(new Employee(106, 34000, "Geeta", "admin"));
		emparr.add(new Employee(110, 68000, "Rahul", "testing"));
		emparr.add(new Employee(109, 61000, "Amar", "develoment"));
		emparr.add(new Employee(104, 55000, "Mnaswi", "marketing"));
		emparr.add(new Employee(107, 46000, "Ruch", "finance"));
		emparr.add(new Employee(112, 76000, "Krishna","developnent"));
		emparr.add(new Employee(104, 86000, "Manoj", "development"));
		
		Iterator<Employee> itr=emparr.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		// 1. Find all employee who are beloning to finance department
		Iterator<Employee> itr1=emparr.iterator();
		System.out.println("Finance dept employee");
		while(itr1.hasNext())
		{
		    Employee e=itr1.next();
		    if(e.getDept().equalsIgnoreCase("finance"))
		    {
		    	System.out.println(e);
		    }
		}
		System.out.println("Before sorting ");
		System.out.println(emparr);
		Collections.sort(emparr);
		System.out.println("After Sorting using comparable name");
		System.out.println(emparr); 
		Collections.sort(emparr,new EmpSalaryComparator());
		System.out.println("After soring using Comparator sal");
		System.out.println(emparr);
	}

	
}
