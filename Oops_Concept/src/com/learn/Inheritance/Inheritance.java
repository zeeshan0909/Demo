package com.learn.Inheritance;

public class Inheritance {
	public static void main(String[] args) {
		Animal a = new Dog();
		a.setId(124);
		a.sound();		
	}
}
class Animal{
	int id ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void sound() {
		System.out.println("their is no sound");
	}
}

class Dog extends Animal{
	public void bark() {
		System.out.println("Dog "+ getId() + " is barking");
	}
	public void sound() {
		bark();
	}
}

class Employee {
	float salary=40000; 
}
class programmer extends Employee {
	double bonus = 60000;
	public static void main(String[] args) {
		programmer p  = new programmer();
		System.out.println("it is bonus " + p.bonus);
		System.out.println("it is salary " + p.salary);
		System.out.println("total salary is " + (p.bonus + p.salary));
	}
}
