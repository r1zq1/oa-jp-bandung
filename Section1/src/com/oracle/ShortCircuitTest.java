package com.oracle;

public class ShortCircuitTest {
	public static void main(String[] args) {
		String s = null;
		if(s != null && s.length() == 0) {
			System.out.println("statement 1");
		} else {
			System.out.println("statement 2");
		}
	}

}
