package com.learn.Abstration;

public class AnimalSound extends Animal{
	
	//must need to override all the abstract method of extended class;
	//here we need to define body of abstract method
	public void animalSound() {
		System.out.println("all animal make sound");
	}
	
	public void cow() {
		System.out.println("cow is sleep");
	}
}
