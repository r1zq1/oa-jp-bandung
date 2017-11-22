package com.oracle;
  
public class RecursiveTest {
	public void methodA() {
		methodA();
	}
	public static void main(String[] args) {
		new RecursiveTest().methodA();
	}

}
