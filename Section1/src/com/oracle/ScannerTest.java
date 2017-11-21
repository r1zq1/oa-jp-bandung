package com.oracle;

import java.util.*;

public class ScannerTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Masukkan nama anda: ");
		String nama = scan.next();
		System.out.println("Masukkan usia anda: ");
		int usia = scan.nextInt();
		System.out.println("Welcome " + nama + " usia anda " +
				"sekarang " + usia + " tahun");
		scan.close();
	}
}