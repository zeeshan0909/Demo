package com.learn.Abstration;

public class Contractor extends ExAbstraction {
	
	private int workingHours;
	private int joinAge;
	
	public Contractor(String name, int peymentPerHour, int workingHours, int joinAge) {
		super(name, peymentPerHour);
		this.workingHours = workingHours;
		this.joinAge = joinAge;
	}
	
	public int calculateSalary() {
		return workingHours * getPeymentPerHour();
	}
	
	public int calculateCTC() {
		return workingHours + getPeymentPerHour();
	}
	
	public int retirement() {
		return joinAge + 25;
	}
	
}