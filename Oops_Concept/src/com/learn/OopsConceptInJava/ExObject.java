package com.learn.OopsConceptInJava;

public class ExObject {
	
	private String name;
	private String college;
	
	public ExObject(String name, String college) {
		super();
		this.name = name;
		this.college = college;
	}

	public String getName() {
		return name;
	}
	
	public void SetName(String name) {
		this.name = name;
	}
	
	public String getCollege() {
		return college;
	}
	
	public void setCollege(String college) {
		this.college = college;
	}
	
	//ye bhi  ek wat hai toString mrthod se ab 
	//direct sys main obj pass kr do to print ho jayega
	//agr hum tostring() method use nhi kregen to wo hashcode print krega.
	public String  toString() {
		return name + " " + college ;
	}
	
	public static void main(String args[]) {
		ExObject obj = new ExObject("Zeeshan Ansari", "Integral University");
		ExObject obj1 = new ExObject("Zeeshan Ansari", "Integral University");
		ExObject obj2 = new ExObject("Zeeshan Ansari", "Integral University");
		
		System.out.println(obj);
		System.out.println(obj1);
		System.out.println(obj2);
		//ek way ye hain obj ka refrance .dot kr k return kr lo.
		System.out.println(obj.getCollege()+" "+obj.getName());
		System.out.println(obj1.getCollege()+" "+obj1.getName());
		System.out.println(obj2.getCollege()+" "+obj2.getName());
		
		
	}

}
