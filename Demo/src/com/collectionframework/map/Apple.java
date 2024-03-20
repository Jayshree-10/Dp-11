package com.collectionframework.map;
/* Contract between equal and hashCode method
 * if two objects are equal to each other based on equals() method, then the 
 * hash code must be the same, but if the hash code is the same, 
 * then equals() can return false.
 * 
 * */
public class Apple {
	String type;
	double value;
	public Apple() {
		// TODO Auto-generated constructor stub
	}
	

	public Apple(String type, double value) {
		super();
		this.type = type;
		this.value = value;
	}


	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public double getValue() {
		return value;
	}


	public void setValue(double value) {
		this.value = value;
	}
    
    
    


	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		int code=(int) (type.length()+value%10);
		System.out.println(code);
		return code;
	}
    public boolean equals(Object o)
    {
    	System.out.println("I am in equals");
    	Apple obj=(Apple) o;
    	if(this.type.equals(obj.type)&&this.value==obj.value)
    		return true;
    	else
    		return false;
    	
    	
    }
    
    

	@Override
	public String toString() {
		return "Apple [type=" + type + ", value=" + value + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
