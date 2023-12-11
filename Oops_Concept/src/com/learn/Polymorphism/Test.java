package com.learn.Polymorphism;

public class Test
{
	public void methodOne(int i)
	{
		System.out.println("int-arg method");
	}
	public void methodOne(float f)		//overloaded methods
	{
		System.out.println("float-arg method");
	}
	public static void main(String[] args)
	{
		Test t=new Test();
		t.methodOne('q');//int-arg method// type cast ho raa.
		t.methodOne(10l);//float-arg method
		//t.methodOne(10.5);//C.E:cannot find symbol (10.5 ko as a double le raa)
		t.methodOne(10.5f);
	}
}

class Testzz{
public void methodOne(int i)	{
 System.out.println("general method");
}

public void methodOne(int...i)	{
	int sum =0;
 System.out.println("var-arg method");
 for(int j=0; j<i.length; j++ ) {
	  sum = sum + i[j]; 
 }
 System.out.println(sum);
}
public static void main(String[] args)	{
 Testzz t=new Testzz();
 t.methodOne();//var-arg method
 t.methodOne(10,20);//var-arg method
 t.methodOne(10,20,90,89,78,78,67,67,64);
 
 t.methodOne(10);//general method
}
}