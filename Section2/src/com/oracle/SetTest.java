package com.oracle;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
//		Set<Kucing> mySet = new HashSet<>();
		KucingNameComparator knc = new KucingNameComparator();
		Set<Kucing> mySet = new TreeSet<>(knc);
		mySet.add(new Kucing("Tom", 7));
		mySet.add(new Kucing("Angora", 4));
		System.out.println(mySet.add(new Kucing("Kitty", 3)));
		mySet.add(new Kucing("Plenok", 5));
		System.out.println(mySet.add(new Kucing("Kitty", 3)));
		System.out.println(mySet.isEmpty());
		System.out.println(mySet.size());
		System.out.println(mySet.contains(new Kucing("Tom", 7)));
		System.out.println(mySet);
//		mySet.remove(new Kucing("Tom", 7));
		System.out.println(mySet);
	}
}