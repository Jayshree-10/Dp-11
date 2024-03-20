package com.collectionframework.list;

import java.util.Comparator;

public class EmpSalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		if(o1.getSal()==o2.getSal())
		    return 0;
		else if(o1.getSal()<o2.getSal())
			return -1;
		else
			return 1;
	}

	

}
