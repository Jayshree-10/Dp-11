package com.jayshree;

public class Manager extends Employee{
	
    private int nop;
    private double bonus;
    public Manager() {
		// TODO Auto-generated constructor stub
    	
	}
    
	public Manager(int eid, String name, String email, double sal,int noe,double bonus) {
		super(eid, name, email, sal);
		// TODO Auto-generated constructor stub
		this.nop=noe;
		this.bonus=bonus;
	}
    public double calculateSal()
    {
    	return super.calculateSal()+bonus;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee obj=new Manager();
		obj.calculateSal();
	}

}
