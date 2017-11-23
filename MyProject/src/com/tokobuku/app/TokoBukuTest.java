package com.tokobuku.app;

import com.tokobuku.domain.Buku;
import com.tokobuku.domain.BukuException;
import com.tokobuku.domain.BukuMemoryImpl;

public class TokoBukuTest {
	public static void main(String[] args) {
		BukuMemoryImpl util = new BukuMemoryImpl();
		try {
//			util.addBuku(new Buku(10, "aaa", "ccc"));
//			System.out.println(util.cariBuku(5));
			System.out.println(util.getAllBuku());
//			util.hapusBuku(1);
			util.updateBuku(new Buku(1, "Abcde", "Fghij"));
			System.out.println(util.getAllBuku());
//			util.hapusBuku(1);
			
		} catch (BukuException e) {
			System.out.println(e.getMessage());
		}
	}
}