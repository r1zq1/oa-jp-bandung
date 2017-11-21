package com.oracle;

public class Kucing implements Comparable<Kucing>{
	private String nama;
	private int umur;
	public Kucing(String nama, int umur) {
		this.nama = nama;
		this.umur = umur;
	}
	public String getNama() {
		return nama;
	}
	public int getUmur() {
		return umur;
	}
	@Override
	public String toString() {
		return "Kucing [nama=" + nama + ", umur=" + umur + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nama == null) ? 0 : nama.hashCode());
		result = prime * result + umur;
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
		Kucing other = (Kucing) obj;
		if (nama == null) {
			if (other.nama != null)
				return false;
		} else if (!nama.equals(other.nama))
			return false;
		if (umur != other.umur)
			return false;
		return true;
	}
	@Override
	public int compareTo(Kucing o) {
//		return nama.compareTo(o.nama);
		int selisih = umur - o.umur;
		if(selisih < 0) {
			return -1;
		} else if(selisih == 0){
			return nama.compareTo(o.nama);
		} else {
			return 1;
		}
	}	
}