package com.oracle;
   
public class StringBuilderTest {
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("Oracle");
		System.out.println(sb);
		System.out.println(sb.toString());
		System.out.println(sb.reverse());
		System.out.println(sb.reverse());
		System.out.println(sb.append(" Java Programming"));
		sb.delete(7, 12);
		System.out.println(sb);
		sb.insert(7, "Java ");
		System.out.println(sb);
		sb.replace(7, 12, "String processing");
		System.out.println(sb);		
	}
}