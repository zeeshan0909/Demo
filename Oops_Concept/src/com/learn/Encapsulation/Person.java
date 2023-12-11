package com.learn.Encapsulation;

class Encapsulation {
	
	private int id;
	private String name;
	public String firstName;
	public int firstId;
	
	
	
	public Encapsulation() {
		//id = Math.random();
		sayHello();
	}
//	public Encapsulation(double id) {
//		this.id=id;
//		double d = getId();
//		System.out.println(d+" ---");
//	}
	
	private void sayHello() {
		System.out.println("hello - " + getId());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
//	public String getfirstName() {
//		return firstName;
//	}
//	
//	public void setfirstName(String firstName) {
//		this.firstName = firstName;
//	}
//	
//	public int getfirstId() {
//		return firstId;
//	}
//	
//	public void setfirstId(int firstId) {
//		this.firstId = firstId;
//	}
}

public class Person{
	public static void main(String args[]) {
//		Encapsulation ed = new Encapsulation(101);
		Encapsulation en = new Encapsulation();
		
		/*
		 * Note: As id and name are encapsulated in Encapsulation class, those cannot be 
		accessed 
		 * directly here. Also there is no way to assign id in this
		 * class. Try to uncomment below code and you would find compile time 
		error.
		 */
		 // en.id = "123";
		 // en.name = "this will give compile time error";
		 // en.sayHello(); // You can't access this method, as it is private to Person
		
		en.firstName = "ansari";//ye direct isliye ho gaya q ki ye public the 
		en.firstId = 1232;//ye direct isliye ho gaya q ki ye public the 
		en.setName("harun");
		en.setId(23);
		System.out.println(en.getId()+" "+ en.getName());
		System.out.println(en.firstName +" "+ en.firstId);
	}
}


class Test{
	
	
	Test(){
		System.out.println("Default Constructor");
	}
	
	static {
		System.out.println("First Static ");
		
	}
	 int n = 6;
	{
		System.out.println(n);
	}
	
	public static void main(String[] args) {
		
		System.out.println("Main");
		Test obj=new Test();

		Test obj2=new Test();	
		
	}
	
	{
		System.out.println("Instance Block");
	}
	
	static {
		System.out.println("This is Second static block");
		
	}
}
