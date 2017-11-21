package com.oracle;

public class Generic<T> {
	T ob;
	// declare an object of type T
	Generic(T o) {
		ob = o;
	}
	T getob() {
		return ob;
	}
	void showType() {
		System.out.println("Type of T is " 
					+ ob.getClass().getName());
	}
}