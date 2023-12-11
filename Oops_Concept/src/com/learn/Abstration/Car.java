package com.learn.Abstration;

abstract class forwheeler {
	
	public abstract void speed();
	
	public abstract void braking();
	
	public void run() {
		System.out.println("car is running");
	}
}

class Verna extends forwheeler{
	public void speed() {
		System.out.println("verna top speed is 200");
	}
	public void braking() {
		System.out.println("verna breaking system is very high");
	}
	public void lightin() {
		System.out.println("verna lighting is very cool");
	}
}

public class Car{
	public static void main(String args[]) {
		Verna verna = new Verna();
		forwheeler forwheeler = new Verna();
		verna.braking();
		verna.speed();
		verna.run();
		verna.lightin();
		forwheeler.braking();
		forwheeler.speed();
		forwheeler.run();
		//forwheeler.lighting();\
		//it is not working becouse lighting is not present is forwheeler.
//		Parant pr=new child();
//		pr.m1();
//		pr.m2();
//		child ch=new child();
//		ch.m1();
//		ch.m2();
//	}
//}
//class Parant{
//	void m1() {
//	}
//}
//class child extends Parant{
//	void m2() {
//	}
	}
}