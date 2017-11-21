package com.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest {
	public static void main(String[] args) {
		List<Kucing> myList = new ArrayList<>(3);
		myList.add(new Kucing("Tom", 7));
		myList.add(new Kucing("Angora", 4));
		System.out.println(myList.add(new Kucing("Kitty", 3)));
		myList.add(1, new Kucing("Plenok", 5));
		System.out.println(myList.add(new Kucing("Kitty", 7)));
		myList.set(2, new Kucing("Telon", 2));
		System.out.println(myList.isEmpty());
		System.out.println(myList.size());
		System.out.println(myList.contains(new Kucing("Tom", 7)));
		System.out.println(myList);
//		myList.remove(new Kucing("Tom", 7));
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);		
	}

}
