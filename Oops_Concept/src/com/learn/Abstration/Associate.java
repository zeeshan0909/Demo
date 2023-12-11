package com.learn.Abstration;

public class Associate extends ExAbstraction{
	
	private int medicalFee;
	private int variable_salary;
	private int joinAge;
	
	public Associate(String name, int peymentPerHour, int medicalFee, int variable_salary, int joinAge) {
		super(name, peymentPerHour);
		this.medicalFee = medicalFee;
		this.variable_salary = variable_salary;
		this.joinAge = joinAge;
	}
	
	public int calculateSalary() {
		return getPeymentPerHour() * 8 * medicalFee;
	}
	
	public int calculateCTC() {
		return getPeymentPerHour() * 8 * medicalFee + variable_salary;
	}
	
	public int retirement() {
		return joinAge + 40;
	}

}
