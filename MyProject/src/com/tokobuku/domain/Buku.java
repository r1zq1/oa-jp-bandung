package com.tokobuku.domain;

public class Buku {
	private int id;
	private String judul;
	private String pengarang;
	public Buku(int id, String judul, String pengarang) {
		this.id = id;
		this.judul = judul;
		this.pengarang = pengarang;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getJudul() {
		return judul;
	}
	public void setJudul(String judul) {
		this.judul = judul;
	}
	public String getPengarang() {
		return pengarang;
	}
	public void setPengarang(String pengarang) {
		this.pengarang = pengarang;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buku other = (Buku) obj;
		if (id != other.id)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Buku [id=" + id + ", judul=" + judul + ", pengarang=" + pengarang + "]";
	}	
	
}