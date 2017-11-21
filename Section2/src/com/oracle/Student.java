package com.oracle;

public class Student implements Comparable<Student>{
	int id;
	String name;
	String address;
	double gpa;
	public Student(int id, String name, String address, double gpa) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.gpa = gpa;
	}
	@Override
	public int compareTo(Student o) {
		int selisih = id - o.id;
		if(selisih < 0) {
			return -1;
		} else {
			return 1;
		}
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", gpa=" + gpa + "]";
	}
	
}