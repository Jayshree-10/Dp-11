package com.String;

public class Demo2StringMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str="Java Programming";
         System.out.println(str.length());
         // String index is also start  with 0

         char ch=str.charAt(2);
         System.out.println(ch);
         String msg="Not found";
         for(int i=0; i<str.length(); i++)
         {
        	 if(str.charAt(i)=='m')
        	 {
        		 msg="Character m is found";       
        		 break;
        	 }
        	 
         }
         System.out.println(msg);
         int count=0;
         for(int i=0; i<str.length(); i++)
         {
        	 char cha=str.charAt(i);
        	 if(cha=='a'||cha =='e')
        	 { 
        		 count++;
        	 }
        	 
         }
         /*str.concat(str)          
         str.compareTo(str)
         str.endsWith(msg);
         str.compareToIgnoreCase(str);
         str.indexOf(ch);
         str.indexOf(str);
         str.indexOf(ch, i)
         str.lastIndexOf(str, i);
         str.lastIndexOf(ch);
         str.replace(ch, ch);
         str.replaceAll(str, msg)
         str.startsWith(msg)
         str.substring(i)
         str.substring(i, i)
         str.toCharArray();
         str.toLowerCase();
         str.toUpperCase();
         
         */
          String s1="Hello";
          String s2="hello";
          System.out.println(s1.compareTo(s2));
          System.out.println(s1.compareToIgnoreCase(s2));
          String s3="programming";
          System.out.println(s3.endsWith("ing"));
         
	}

}
 