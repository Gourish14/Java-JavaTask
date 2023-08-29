package com.cozentus.JavaTask;

abstract class Vehiclee {
	
	  public abstract void startEngine();
	  public abstract void stopEngine();
	}

class Carr extends Vehiclee {
		
	  public void startEngine() {
	    System.out.println("Car Start");
	  }

	  public void stopEngine() {
	    System.out.println("Car Stop");
	  }
}

class Motorcyclee extends Vehiclee {

	  public void startEngine() {
	    System.out.println("Motorcycle Start");
	  }

	  public void stopEngine() {
	    System.out.println("Motorcycle Stop");
	  }
}
public class Question15 {
	public static void main(String[] args) {
	    Vehiclee c = new Carr();
	    Vehiclee m = new Motorcyclee();

	    c.startEngine();
	    c.stopEngine();
	    System.out.println();
	    m.startEngine();
	    m.stopEngine();
	  }
}