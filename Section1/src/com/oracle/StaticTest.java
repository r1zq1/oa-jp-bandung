package com.oracle;

class Person {
	String name;
	static String address;
	public void displayPerson() {
		System.out.println("Name: "+name+" Alamat: "+address);
	}
}
public class StaticTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person();
		p1.name = "Anton";
		p1.address = "Cirebon";
		p2.name = "Budi";
		p2.address = "Padang";
		Person.address = "Bandung";
		p1.displayPerson();
		p2.displayPerson();
	}
}