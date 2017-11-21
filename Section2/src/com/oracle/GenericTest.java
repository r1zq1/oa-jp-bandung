package com.oracle;

public class GenericTest {

	public static void main(String[] args) {
		Generic<Integer> iOb = new Generic<Integer>(88);
		Generic<Integer> iOb2 = new Generic<>(88);
		iOb.showType();
		int v = iOb.getob();
		System.out.println("value: " + v);
		System.out.println();
		
		Generic<String> strOb = new Generic<String>("Generics Test");
		String v2 = strOb.getob();
		strOb.showType();
		System.out.println("value: " + v2);
		System.out.println();
		
//		Integer i = (Integer) strOb.getob();
	}

}
