package com.oracle;

public class MyDateTest {
	public static void main(String[] args) {
		MyDate today1 = new MyDate(11,11,2017);
		MyDate today2 = new MyDate(11,11,2017);
		System.out.println(today1.equals(today2));
	}
}
