package com.oracle;

public class LoopingTest {
	public static void main(String[] args) {
		// for
		for(int i = 1; i <= 10; i++) {
			System.out.println(i);
		}
		// while
		int j = 1;
		while(j <= 10) {
			System.out.println(j);
			j++;
		}
		// do..while
		int k = 1;
		do {
			System.out.println(k);
			k++;
		} while (k <= 10);
	}
}