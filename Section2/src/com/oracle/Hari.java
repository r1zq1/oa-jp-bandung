package com.oracle;

public enum Hari {
	SENIN(1),SELASA(2),RABU(3),
	KAMIS(4),JUMAT(5),SABTU(6),MINGGU(7);
	private int value;
	private Hari(int value) {
		this.value = value;
	}
	public int getValue() {
		return value;
	}
}