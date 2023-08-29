package com.cozentus.JavaTask;

abstract class GeometricShape {
	
	  public abstract int area();
	  public abstract int perimeter();
}

class Trianglee extends GeometricShape {
	  private int side1;
	  private int side2;
	  private int side3;

	  public Trianglee(int side1, int side2, int side3) {
	    this.side1 = side1;
	    this.side2 = side2;
	    this.side3 = side3;
}

	  public int area() {
	    return side1*side2*side3;
	  }


	  public int perimeter() {
	    return side1+side2+side3;
	  }
}

class Square extends GeometricShape {
	  private int side;

	  public Square(int side) {
	    this.side = side;
	  }
	  public int area() {
	    return side*side;
	  }

	  public int perimeter() {
	    return 4*side;
	  }
}
public class Question12 {
	public static void main(String[] args) {
	    GeometricShape t = new Trianglee(2, 2, 2);
	    GeometricShape s = new Square(2);

	    System.out.println("Triangle Area: " +t.area());
	    System.out.println("Triangle Perimeter: " +t.perimeter());
	    System.out.println();
	    System.out.println("Square Area: " +s.area());
	    System.out.println("Square Perimeter: " +s.perimeter());
	  }
}
