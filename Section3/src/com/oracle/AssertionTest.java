package com.oracle;
  
public class AssertionTest {
	public static void main(String[] args) {
		int i = -10;
		if(i > 0) {
			System.out.println("bilangan positif");
		} else {
			assert i == 0 : "i akan selalu bernilai 0";
		}
	}
}