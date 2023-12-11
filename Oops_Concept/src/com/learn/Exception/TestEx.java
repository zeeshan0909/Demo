package com.learn.Exception;

public class TestEx  {
	public static void justThrowException() throws CustomException{
		throw new CustomException("define your custom exception");
	}
	public static void main(String[] args) {
		try {
			
			justThrowException();
		}
		catch(CustomException e){
			e.printStackTrace();
		}
	}

}


class CustomException extends Exception{
	public CustomException(String s) {
		super(s);
	}
}





















