package com.oracle;

public class SiswaTest {
	public static void main(String[] args) {
		Siswa s1 = new Siswa();
		Siswa s2 = new Siswa(201711001, "Andi", "Bandung", 8.765);
		System.out.println(s1);
		System.out.println(s1.toString());
		System.out.println(s2);
	}
}