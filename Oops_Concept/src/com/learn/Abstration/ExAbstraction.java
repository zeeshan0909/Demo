package com.learn.Abstration;

public abstract class ExAbstraction {
	private String name;
	private int peymentPerHour;
	
	public ExAbstraction(String name , int peymentPerHour) {
		super();
		this.name = name;
		this.peymentPerHour = peymentPerHour;
	}
	
	public abstract int calculateSalary();
	
	public abstract int calculateCTC();
	
	public abstract int retirement();
	
	//get set for String name
	public String getName() {
		return name;
	}
	public void SetName(String name) {
		this.name = name;
	}
	
	//get set for int peyPerHour
	public int getPeymentPerHour() {
		return peymentPerHour;
	}
	public void setPeymentPerHour(int peymentPerHour) {
		this.peymentPerHour = peymentPerHour;
	}
	
}





