package com.learn.Exception;

public class MyException {
	public static void justThrowException() throws YourException {
		throw new YourException("this is my exception");
	}
	public static void main(String[] args) {
		try {
				justThrowException();
		}catch(YourException e) {
			
			e.printStackTrace();
			System.out.println(e.getMessage());
			String ss = e.getMessage();
			System.out.println(ss);
			
		}
	}

}

class YourException extends Exception {
	public YourException(String s) {
		super(s);
	}
}

