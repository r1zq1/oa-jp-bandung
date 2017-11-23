package com.tokobuku.domain;

import java.util.ArrayList;
import java.util.List;

public class BukuMemoryImpl implements BukuIntf {
	private List<Buku> books;
	private final String[] propertiBuku = {"Id","Judul","Pengarang"};
	public BukuMemoryImpl() {
		books = new ArrayList<>();
		inisialisasiBuku();
	}
	private void inisialisasiBuku() {
		books.add(new Buku(1,"Java Fundamentals","James Gosling"));
		books.add(new Buku(2,"Java Foundations","Lawrence J. Ellison"));
		books.add(new Buku(3,"Java Programming","Jeffrey O. Henley"));
		books.add(new Buku(4,"Database Design","Leon Panetta"));
		books.add(new Buku(5,"Database Programming with SQL","Mark Hurd"));
		books.add(new Buku(6,"Database Programming with PL/SQL","Safra A. Catz"));
		books.add(new Buku(7,"Database Foundations","Vivian Wong"));
	}
	public String[] getPropertiBuku() {
		return propertiBuku;
	}
	public Object[][] getSemuaDataBuku() {
		Object[][] o = new Object[books.size()][propertiBuku.length];
		for(int i = 0 ; i < books.size() ; i++) {
			o[i][0] = books.get(i).getId(); 
			o[i][1] = books.get(i).getJudul(); 
			o[i][2] = books.get(i).getPengarang(); 
		}
		return o;
	}
	@Override
	public void addBuku(Buku b) throws BukuException {
		if(books.contains(b)) {
			throw new BukuException("Buku sudah ada");
		} else {
			books.add(b);
		}
	}
	@Override
	public Buku cariBuku(int id) throws BukuException {
		Buku dummy = new Buku(id, "", "");
		if(books.contains(dummy)) {
			return books.get(books.indexOf(dummy));
		} else {
			throw new BukuException("Buku dengan id "+ id +" tidak ditemukan");			
		}
	}
	@Override
	public void hapusBuku(int id) throws BukuException {
		Buku dummy = new Buku(id, "", "");
		if(books.contains(dummy)) {
			books.remove(dummy);
		} else {
			throw new BukuException("Buku dengan id "+ id +" tidak ditemukan");			
		}		
	}
	@Override
	public void updateBuku(Buku b) throws BukuException {
		if(books.contains(b)) {
			books.set(books.indexOf(b), b);
		} else {
			throw new BukuException("Buku dengan id "+ b.getId() +" tidak ditemukan");			
		}		
	}
	@Override
	public List<Buku> getAllBuku() throws BukuException {
		return books;
	}	
}