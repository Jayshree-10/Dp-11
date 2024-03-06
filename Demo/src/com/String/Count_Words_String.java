package com.String;

public class Count_Words_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "I am a good boy";
		String s = str.toString();
		System.out.println(s);

		char ch[] = str.toCharArray();
		int count = 0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == ' ')
				count++;
		}
		System.out.println("\n" + count);

	}

}
