package com.String;

public class Reverse_Word_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "How are you";
		String arr[] = str.split(" ");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		//System.out.println(arr.length);

		System.out.println("\n*******************");
		for(int i=arr.length-1;i>=0;i--)
		{
			//System.out.print(arr[i]+" ");
			char ch[]=arr[i].toCharArray();
			for(int j=ch.length-1;j>=0;j--)
			{
				System.out.print(ch[j]+"");
			}
			System.out.print(" ");

		}
//		for (int i = 0; i < arr.length; i++) {
//			//System.out.print(arr[i] + " ");
//			char ch[] = arr[i].toCharArray();
//			for (int j = ch.length - 1; j >= 0; j--) {
//				System.out.print(ch[j]);
//			}
//			System.out.print(" ");

		//}

	}

}
