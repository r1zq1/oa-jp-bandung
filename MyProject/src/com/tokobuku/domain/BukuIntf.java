package com.tokobuku.domain;

import java.util.List;

public interface BukuIntf {
	void addBuku(Buku b) throws BukuException;
	Buku cariBuku(int id) throws BukuException;
	void hapusBuku(int id) throws BukuException;
	void updateBuku(Buku b) throws BukuException;
	List<Buku> getAllBuku() throws BukuException;
}