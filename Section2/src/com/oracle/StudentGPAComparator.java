package com.oracle;

import java.util.Comparator;

public class StudentGPAComparator implements Comparator<Student>{
	@Override
	public int compare(Student o1, Student o2) {
		double selisih = o1.gpa - o2.gpa;
		if(selisih < 0) {
			return 1;
		} else if (selisih == 0) {
			return o1.name.compareTo(o2.name);
		} else {
			return -1;
		}
	}
}