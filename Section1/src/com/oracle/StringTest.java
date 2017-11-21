package com.oracle;

public class StringTest {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = new String("Hello");
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
		System.out.println(System.identityHashCode(s3));
		s1 = s1 + " apa kabar?";
		System.out.println(System.identityHashCode(s1));
		StringBuilder sb1 = new StringBuilder("Hello");
		System.out.println(System.identityHashCode(sb1));
		sb1 = sb1.append(" apa kabar?");
		System.out.println(System.identityHashCode(sb1));		
	}
}