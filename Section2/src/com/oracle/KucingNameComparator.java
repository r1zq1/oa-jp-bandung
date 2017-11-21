package com.oracle;

import java.util.Comparator;

public class KucingNameComparator implements Comparator<Kucing>{
	@Override
	public int compare(Kucing o1, Kucing o2) {
		return o2.getNama().compareTo(o1.getNama());
	}
}