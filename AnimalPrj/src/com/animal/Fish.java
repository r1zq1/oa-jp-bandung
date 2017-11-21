package com.animal;

public class Fish extends Animal implements Pet{
	private String name;
	public Fish() {
		super(0);
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
		System.out.println("Ikan bermain bola");
	}
	@Override
	public void eat() {
		System.out.println("Ikan makan plankton");
	}
	@Override
	public void walk() {
		System.out.println("Ikan tidak berjalan, "
				+ "tapi berenang");
	}
}