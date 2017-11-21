package com.oracle;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapTest {
	public static void main(String[] args) {
//		Map<String, Kucing> myMap = new HashMap<>();
		Map<String, Kucing> myMap = new TreeMap<>();
		myMap.put("hiji", new Kucing("Tom", 3));
		myMap.put("dua", new Kucing("Kitty", 5));
		myMap.put("tilu", new Kucing("Persia", 4));
		myMap.put("opat", new Kucing("Plenok", 2));
		myMap.put("dua", new Kucing("Kitten", 6));
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.entrySet());
		System.out.println(myMap.get("tilu"));
	}
}