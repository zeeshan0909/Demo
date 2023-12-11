package com.learn.Polymorphism;

public class Polymorphism2 {
	
	

}
class p {
	void print(){
		System.out.println("p k print");
	}
}
class c1 extends p {
	void print(){
		System.out.println("c1 k print");
	}
	
}
class c2 extends p {
	void print(){
		System.out.println("c2 k print");
	}
	
}
class Main{
	public static void main(String [] args) {
		p obj = new c1();
		p obj2 = new c2();
		obj.print();
		obj2.print();
	}
}