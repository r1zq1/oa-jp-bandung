package com.oracle;

public class NonGenericTest {

	public static void main(String[] args) {
		NonGeneric integerObject;
		integerObject = new NonGeneric(88);
		integerObject.showType();

		int v = (Integer) integerObject.getob();
		System.out.println("value: " + v);
		
		NonGeneric strOb = new NonGeneric("10");
		strOb.showType();
		String str = (String) strOb.getob();
		System.out.println("value: " + str); 
//		// menyebabkan exception 
		Integer i = (Integer) strOb.getob();
	}
}