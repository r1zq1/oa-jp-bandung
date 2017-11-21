package com.animal;

public class Cat extends Animal implements Pet {
	private String name;
	public Cat(String name) {
		super(4);
		this.name = name;
	}
	public Cat() {
		this("Kitty");
	}
	@Override
	public String getName() {
		return name;
	}
	@Override
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public void play() {
		System.out.println("Kucing bermain air");
	}
	@Override
	public void eat() {
		System.out.println("Kucing makan ikan");
	}
}