package com.learn.Exception;

public class Main {
	public static void main(String[] args) {
		try{
			throw new GetMessageException();
		}catch(GetMessageException e) {
			
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			//System.out.println(e.printStackTrace());
		}
	}

}
class GetMessageException extends Exception {
//	public GetMessageException(String s) {
//		super(s);
//	}
}
