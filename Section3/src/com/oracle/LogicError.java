package com.oracle;

public class LogicError {
	public static void main(String[] args) {
		for(int i = 1; i <= 10 ; i++); {
			System.out.println("Hello");
		}
	}
}