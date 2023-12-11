package com.learn.Polymorphism;

class Shapes {
	  public void area() {
	    System.out.println("The formula for area of ");
	  }
	}
	class Triangle extends Shapes {
	  public void area() {
	    System.out.println("Triangle is ½ * base * height ");
	  }
	}
	class Circle extends Shapes {
	  public void area() {
	    System.out.println("Circle is 3.14 * radius * radius ");
	  }
	}
	
	public class MyMain {
		  public static void main(String[] args) {
			Shapes myShape = new Shapes();  // Create a Shapes object
		    Shapes myTriangle = new Triangle();  // Create a Triangle object
		    Shapes myCircle = new Circle();  // Create a Circle object
		    
		    myShape.area();
		    myTriangle.area();
		    myShape.area();
		    myCircle.area();
		  }
		}
	
	class Shape {
	    public void draw() {
	        System.out.println("Drawing a shape");
	    }
	}

	class Circles extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a circle");
	    }
	}

	class Square extends Shape {
	    @Override
	    public void draw() {
	        System.out.println("Drawing a square");
	    }
	}
	class Hii{
	    public static void main(String[] args) {
	        Shape s1 = new Circles();
	        Shape s2 = new Square();
	        
	        s1.draw(); // Output: "Drawing a circle"
	        s2.draw(); // Output: "Drawing a square"
	    }
	}
