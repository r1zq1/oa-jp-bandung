package com.oracle;

public class ArrayTest {
	public static void main(String[] args) {
		// declaration
		int [] myArray;
		// instantiation
		myArray = new int[4];
		// initialization
		myArray[0] = 10;
		myArray[1] = 20;
		myArray[2] = 30;
		myArray[3] = 40;
		// alternative lain:
		int [] myArray2 = {10,20,30,40};
		// for
		for(int i=0; i<myArray.length; i++) {
			System.out.println(myArray[i]);
		}
		// enhanced for loop
		for(int element : myArray2) {
			System.out.println(element);
		}
		
		myArray = new int[10];
	}
}