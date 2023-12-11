package com.learn.Polymorphism;

//1. Create Payment interface
//2. Create CashPayment class which implements Payment interface
//3. Create CreditPayment class which implements Payment interface
//4. Let’s create a Polymorphism class with main() method for testing.
interface Payment {
	 public void pay();
}
class CashPayment implements Payment {
	@Override
	public void pay() {
		System.out.println("CashPayment");
	}
}
class CreditPayment implements Payment {
	@Override
	public void pay() {
		System.out.println("CreditPayment");
	}
}
public class Polymorphism {
	public static void main(String[] args) {
		Payment p1 = new CashPayment();
		Payment p2 = new CreditPayment();
		p1.pay();
		p2.pay();
		
		
	}
	

}

class Adder {
	 static int add(int a, int b) {
	 return a + b;
	 }
	 static void print() {
		 System.out.println("beech main print krega");
	 }
	 static int add(int a, int b, int c) {
	 return a + b + c;
	 }
	}
	class TestOverloading1 {
	 public static void main(String[] args) {
	 System.out.println(Adder.add(11, 11));
	 Adder.print();
	 System.out.println(Adder.add(11, 11, 11));
	 }
	}
	
	
	class Shapess {
		 void draw() {
		 System.out.println("drawing...");
		 }
		}
		class Rectangle extends Shapess {
		 void draw() {
		 System.out.println("drawing rectangle...");
		 }
		}
		class Circless extends Shapess {
		 void draw() {
		 System.out.println("drawing circle...");
		 }
		}
		class Triangles extends Shapess {
		 void draw() {
		 System.out.println("drawing triangle...");
		 }
		}
		class TestPolymorphism2 {
		 public static void main(String args[]) {
		 Shapess s = new Rectangle();
		 s.draw();
		 s = new Circless();
		 s.draw();
		 s = new Triangles();
		 s.draw();
		 }
		}
