package com.String;

public class Valid_Number_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "6261904221";
		int count = 0;
		char ch[] = s.toCharArray();
		for (int j = 0; j < ch.length; j++) {
			if (ch.length != 10) {
				break;
			}
			if (ch[j] >= 48 && ch[j] <= 57) {
				count++;
			}
		}

		if (count == 10) {
			System.out.println("Valid number");
		} else
			System.out.println("This IS A Wrong Number...");

	}

}
