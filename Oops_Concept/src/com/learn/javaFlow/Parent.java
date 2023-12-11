package com.learn.javaFlow;

//Parent class
public class Parent {
	
		// initializing instance integer x = 10
		int x = 10;

		// first instance block of Parent class
		{
			// call instance method (methodeOne())
			methodOne();
			System.out.println("Parent First Instance Block");
		}

		// constructor of Parent class
		Parent()
		{
			System.out.println("Parent Class Constructor");
		}

		// main method of Parent class
		public static void main(String[] args)
		{
			// create Parent class object
			Parent p = new Parent();
			System.out.println("Parent Class Main Method");
		}

		// instance method (methodOne())
		public void methodOne() { System.out.println(y); }

		// initializing instance integer y = 20
		int y = 20;
	}

	// Child class
	class Child extends Parent {

		// initializing instance integer i = 100
		int i = 100;

		// first instance block of Child class
		{
			methodTwo();
			System.out.println("Child First Instance Block");
		}

		// constructor of Child class
		Child()
		{
			System.out.println("Child Class Constructor");
		}

		// main method of Child class
		public static void main(String[] args)
		{
			// create Child class object
			Child c = new Child();
			System.out.println("Child Class Main Method");
		}

		// instance method (methodTwo())
		public void methodTwo() { System.out.println(j); }

		// second instance block of Child class
		{
			System.out.println("Child Second Instance Block");
		}

		// initializing instance integer j = 200
		int j = 200;


}
