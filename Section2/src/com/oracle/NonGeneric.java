package com.oracle;

public class NonGeneric {
	Object ob;
	NonGeneric(Object o) {
		ob = o;
	}
	Object getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of ob is " + 
						ob.getClass().getName());
	}
}