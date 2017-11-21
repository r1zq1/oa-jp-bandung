package com.oracle;

public class StringTest {
	public static void main(String[] args) {
		String a = "Hello World Satu Dua Tiga";
		for(int i = 0 ; i < a.length() ; i++) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		for(int i = a.length()-1 ; i >= 0 ; i--) {
			System.out.print(a.charAt(i));
		}
		System.out.println();
		String [] b = a.split("[oa]");
		for (String string : b) {
			System.out.println(string);
		}
		System.out.println(a.substring(5));
		System.out.println(a.substring(4));
		System.out.println(a.substring(2,7));
		System.out.println(a.replace('o', 'a'));
		System.out.println(a.toUpperCase());
		System.out.println(a.indexOf("World"));
	}
}