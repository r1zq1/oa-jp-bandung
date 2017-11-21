package com.animal;

public class AnimalTest {
	public static void main(String[] args) {
//		Animal a = new Animal();
//		Pet p = new Pet();
		Animal ac = new Cat();
		ac.eat();
		ac.walk();
//		ac.play(); 
		Pet pc = new Fish();
//		pc.eat();
		pc.play();
		System.out.println(pc.getName());
		
		Cat c = new Cat();
		c.eat();
		c.walk();
		c.play();
		c.setName("Tom");
		System.out.println(c.getName());
		
		if(pc instanceof Cat) {
			Cat f = (Cat)pc;
			f.play();
			f.eat();
		} else if(pc instanceof Fish) {
			Fish f = (Fish)pc;
			f.play();
			f.eat();
			f.walk();
		}
	}
}