package com.oracle;

import java.time.LocalDateTime;

public class EnumTest {
	public static void main(String[] args) {
		Hari h = Hari.SELASA;
		System.out.println(h);
		
		for(Hari x : Hari.values()) {
			System.out.println(x);
		}
		
		LocalDateTime now = LocalDateTime.now();
		System.out.println(now);
	}
}