package com.String;

public class Remove_First_Occurence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "HelloWorld";
		char ch[] = str.toCharArray();

		for (int i = 0; i < ch.length; i++) {
			if ('l' == ch[i]) {
				ch[i] = '$';
				break;
			}
		}
		int j = 0;
		char ch1[] = new char[ch.length - 1];
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '$')
				continue;

			ch1[j] = ch[i];
			j++;

		}
		for (int i = 0; i < ch1.length; i++) {
			System.out.print(ch1[i]);

		}

	}

}
