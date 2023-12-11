package com.learn.Polymorphism;

public class Bike {
	int speedlimit = 90;
}
class Honda extends Bike {
	int speedlimit = 150;
	public static void main(String[] args) {
		Bike b = new Bike();
		System.out.println(b.speedlimit);
	}
}

class Animal {
	void eat() {
		System.out.println("animal is eating");
	}
}
class Dog extends Animal{
	void eat() {
		System.out.println("Dog is eating");
	}
}
class cat extends Dog{
	public static void main(String[] args) {
		Animal a = new cat();
		cat t = new cat();
		Animal aa = new Animal();
		aa.eat();
		t.eat();
		a.eat();
	}
}

