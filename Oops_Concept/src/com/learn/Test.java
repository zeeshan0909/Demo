package com.learn;

public class Test {
	
	{
		System.out.println("hii");
	}
	
	public static void main(String[] args) {
		Test.print();
		Test t = new Test();
		
	}
	
	public static void print() {
		System.out.println("hello");
	}
	static {
		System.out.println("you");
	}
}
