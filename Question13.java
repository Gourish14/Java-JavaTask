package com.cozentus.JavaTask;

abstract class Bird {
	
	  public abstract void fly();
	  public abstract void makeSound();
}

class Eagle extends Bird {

	  public void fly() {
	    System.out.println("Eagle fly");
	  }
	  public void makeSound() {
	    System.out.println("Eagle make sound");
	  }
}

class Hawk extends Bird {

	  public void fly() {
	    System.out.println("Hawk fly");
	  }
	  public void makeSound() {
	    System.out.println("Hawk make sound");
	  }
}

public class Question13 {
	  public static void main(String[] args) {
	    Bird e = new Eagle();
	    Bird h = new Hawk();

	    e.fly();
	    e.makeSound();
	    System.out.println();
	    h.fly();
	    h.makeSound();
	  }
}
