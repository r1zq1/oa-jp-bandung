package com.oracle;

public class Siswa extends Object {
	private int id;
	private String nama;
	private String alamat;
	private double nilai;	
	public Siswa() {
		this(-1,"Nama Siswa","Alamat Siswa",0.0);
	}
	public Siswa(int id, String nama, String alamat, double nilai) {
		this.id = id;
		this.nama = nama;
		this.alamat = alamat;
		this.nilai = nilai;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNama() {
		return nama;
	}
	public void setNama(String nama) {
		this.nama = nama;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	public double getNilai() {
		return nilai;
	}
	public void setNilai(double nilai) {
		this.nilai = nilai;
	}
	@Override
	public String toString() {
		return "Siswa [id=" + id + ", nama=" + nama + ", alamat=" + alamat + ", nilai=" + nilai + "]";
	}	
}