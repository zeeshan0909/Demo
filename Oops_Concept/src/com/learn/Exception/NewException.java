package com.learn.Exception;

public class NewException   {
	public static void justThrowException() throws TestException {
		throw new TestException("hfsdofnso");
	}
	public static void main(String[] args) throws TestException{
		justThrowException();
//		try {
//			justThrowException();
//		}
//		catch(TestException e) {
//			e.printStackTrace();
//		}
	}
}
class TestException extends Exception{
	public TestException(String s){
		super(s);
	}
}