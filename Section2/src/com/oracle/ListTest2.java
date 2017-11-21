package com.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<String> myList = new ArrayList<>();
		myList.add("Nishom");
		myList.add("Asri");
		myList.add("Robby");
		myList.add("Isa");
		myList.add("Eddy");
		myList.add("Agus");
		myList.add("Asep");
		myList.add("Wahyu");
		System.out.println(myList);
		Collections.sort(myList);
		System.out.println(myList);		
	}
}