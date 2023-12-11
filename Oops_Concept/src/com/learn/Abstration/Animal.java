package com.learn.Abstration;
//use abstract keyword to make a class abstract
public abstract class Animal {
	// abstract method does not have body
	//use abstract keyword to make a method abstract
	public abstract void animalSound();
	public abstract void cow();
	
	//regular method
	public void sleep() {
		System.out.println("ZZZzzzz");
	}
}
