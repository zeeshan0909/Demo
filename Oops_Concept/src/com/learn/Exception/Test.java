package com.learn.Exception;

public class Test {
	static public int add(int a, int b) {
		try {
			return a/b;
		}
		catch(ArithmeticException e){
			String s = e.toString();
			System.out.println(s);
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		return 8;
		
	}
	public static void main(String[] args) {
		
		Test.add(12, 0);
	}

}
