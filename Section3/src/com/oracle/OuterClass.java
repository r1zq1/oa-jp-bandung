package com.oracle;

public class OuterClass {
	int a = 10;
	class Inner1 {
		int a = 100;
		public void methodInner1() {
			System.out.println(a);
			System.out.println(OuterClass.this.a);
		}
	}
	private class Inner2 {
		
	}
	protected static class Inner3 {
		public static void methodInner3() {
			System.out.println("methodInner3");
		}
	}
	public void methodA() {
		class Inner4 {
			
		}
	}
}
class OuterClass2 {
	public static void main(String[] args) {
		OuterClass oc = new OuterClass();
		OuterClass.Inner1 oi1 = oc.new Inner1();
		oi1.methodInner1();
		OuterClass.Inner3.methodInner3();
	}
}