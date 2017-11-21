package com.oracle;

public class GenericMethodTest {
	public static <E> void printArray(E[] inputArray) {
		for (E element : inputArray) {
			System.out.printf("%s", element);
			System.out.print("  ");
			if(element instanceof Integer) {
				int x = (int) element;
				if(x == 3) {
					return;
				}
			}
		}
		System.out.println("");
	}
	public static void main(String[] args) {
		Integer[] intArray = { 1, 2, 3, 4, 5 };
		Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
		Character[] charArray = { 'J', 'A', 'V', 'A' };
		printArray(intArray);
		printArray(doubleArray);
		printArray(charArray);
		int a = 3;
		int b = 2;
		int c = -1;
		if(a + b % c > (a + (-b) * (-c))) {
			System.out.println(a + b - c);
		}

	}
}
