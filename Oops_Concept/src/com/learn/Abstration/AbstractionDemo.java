package com.learn.Abstration;

public class AbstractionDemo {
	
	
	public static void main(String args[]) {
		ExAbstraction contractor = new Contractor("contractor", 10, 10, 20);
		ExAbstraction fullTimeEmployee = new FullTimeEmployee("Full time employee", 8, 10, 20);
		ExAbstraction associate = new Associate("associate", 10, 10 , 20, 20);
		
		//fullTimeEmployee.SetName("harun");
		
		System.out.println(contractor.getName()  +  " " + contractor.calculateSalary() + " " + contractor.calculateCTC() +" "+ contractor.retirement());
		System.out.println(fullTimeEmployee.getName()  +  " " +fullTimeEmployee.calculateSalary() +" " + fullTimeEmployee.calculateCTC() +" "+fullTimeEmployee.retirement());
		System.out.println(associate.getName() + " " + associate.calculateSalary() + " " + associate.calculateCTC() + " " + associate.retirement());
	}

}
