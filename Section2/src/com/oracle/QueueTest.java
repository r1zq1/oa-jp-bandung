package com.oracle;

import java.util.LinkedList;

public class QueueTest {
	public static void main(String[] args) {
		LinkedList<String> myLL = new LinkedList<>();
		myLL.add("satu");
		myLL.add("dua");
		myLL.add("tiga");
		myLL.add("empat");
		myLL.add("lima");
		myLL.add("enam");
		System.out.println(myLL);
		System.out.println(myLL.getFirst());
		System.out.println(myLL);
		System.out.println(myLL.removeFirst());
		System.out.println(myLL);		
		System.out.println(myLL.getLast());
		System.out.println(myLL);
		System.out.println(myLL.removeLast());
		System.out.println(myLL);		
		System.out.println(myLL.removeLast());
		System.out.println(myLL.removeLast());
		System.out.println(myLL.removeLast());
		System.out.println(myLL.removeLast());		
		System.out.println(myLL);		
	}
}