package com.oracle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class StudentTest {
	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(7, "Zico", "Bandung", 8.5));
		studentList.add(new Student(2, "Anton", "Tangerang", 6.5));
		studentList.add(new Student(5, "Maman", "Aceh", 7.5));		
		studentList.add(new Student(12, "Deni", "Solo", 7.5));
		System.out.println("Un-sorted");
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("Sorted using natural ordering");
		Collections.sort(studentList);
		for (Student student : studentList) {
			System.out.println(student);
		}
		System.out.println("Sorted using comparator");
		Collections.sort(studentList, new StudentGPAComparator());
		for (Student student : studentList) {
			System.out.println(student);
		}		
	}
}