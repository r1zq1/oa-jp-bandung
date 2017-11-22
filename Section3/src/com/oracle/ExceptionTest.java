package com.oracle;
 
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest {
	public static void main(String[] args) {
		System.out.println("entering main method ....");
		for(int i = 0; i < args.length; i++) {
			System.out.println(args[i]);
		}
		System.out.println("Masukkan bilangan yang anda mau");
		Scanner scan = null;
		try {
			scan = new Scanner(System.in);
			int x = scan.nextInt();
			System.out.println("Bilangan anda adalah: " + x);
		} catch (InputMismatchException ime) {
			System.err.println("Anda tidak memasukkan bilangan");
		} finally {
			scan.close();
			System.out.println("selalu dikerjakan");
		}
		System.out.println("leaving main method ....");
	}
}