package com.learn.Abstration;

public class FullTimeEmployee extends ExAbstraction{
	
	private int variable_salary;
	private int joinAge;
	
	public FullTimeEmployee(String name, int peymentPerHour , int variable_salary, int joinAge) {
		super(name, peymentPerHour);
		this.variable_salary = variable_salary;
		this.joinAge = joinAge;
	}
	
	@Override
	public int calculateSalary() {
		return getPeymentPerHour() * 8;
	}
	
	public int calculateCTC() {
		return getPeymentPerHour() * 8 + variable_salary; 
	}
	
	public int retirement() {
		return joinAge + 30;
	}
}
