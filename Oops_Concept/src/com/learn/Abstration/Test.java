package com.learn.Abstration;

class Parent {
	void m1() {
		System.out.println("this is m1 fo Parent class");
	}
}

class Child extends Parent{
	void m2() {
		System.out.println("this is m2 fo child class");
	}
}
public class Test {

	public static void main(String[] args) {
		Parent pp=new Parent();
		Parent pc=new Child();
		Child cc=new Child();
		
		pp.m1();
		//pp.m2() its give error because it is not present in parent class. 
		
		pc.m1();
		//pp.m2() its give error because it is not present in parent class.
		
		cc.m1();
		cc.m2();
		//its work for both m1 and m2 because child extend the parent class 
		//and child class inhearite it properties and methods.
		
	}
}
