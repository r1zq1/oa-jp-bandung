package com.oracle;

public class VarArgTest {
//	public static int sum(int a, int b) {
//		return a + b;
//	}
//	public static int sum(int a, int b, int c) {
//		return a + b + c;
//	}
	public static int sum(int...a) {
		int total = 0;
		for (int i : a) {
			total = total + i;
		}
		return total;
	}
	public static void main(String[] args) {
		System.out.println(sum(new int[]{5,9}));
		System.out.println(sum(5,9,10));
		System.out.println(sum(new int[]{5,9,10,23,4,5,7,8,9,10}));
		System.out.println(sum(5,9,10,3,4,7,8,9,10));
		System.out.println(sum(5));
	}
}