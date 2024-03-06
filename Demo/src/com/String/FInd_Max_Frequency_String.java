package com.String;

public class FInd_Max_Frequency_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Abbbhbhihbhbhhbhshbhbehk";
		int max = 0;
		char ch1 =0;
		int temp=0;
		char ch[] = str.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			int count = 0;
			for (int j = i + 1; j < ch.length; j++) {
				if (ch[i] == ch[j]) {
					count++;
				}
			}
			if (count >= 0) {
				boolean isnotchecked = true;
				for (int k = i - 1; k >= 0; k--) {
					if (ch[k] == ch[i]) {
						isnotchecked = false;
					}
				}
				if (isnotchecked) {
					System.out.println(ch[i] + " count" + (count + 1));
					temp=count+1;
					
				}
				if (temp > max) {
					max = count+1 ;
					ch1 = ch[i];
				}

			}
		}
		System.out.println(ch1 + " has highest frequency= " + max);

	}

}
